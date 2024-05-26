package com.zkf.forjob.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ServiceGene {
    //模板路径
    static String template_path = "E:\\zkf\\project\\MyBase\\forjob\\src\\main\\resources\\templates";
    // 输出文件路径

    public static void main(String[] args) throws IOException, TemplateException {
        String className = "SaleTarget";
        //生成service
        String serviceClassName = className;
        String servicePackageName = "package com.sudytech.mybaits.apps.cleansystem.web.service;";
        generateService(serviceClassName, servicePackageName);

        //生成serviceImpl
        String serviceImplClassName = className;
        String packageName = "package com.sudytech.mybaits.apps.cleansystem.web.service.impl;";
        generateServiceImpl(serviceImplClassName, packageName);
    }

    private static void generateServiceImpl(String className, String packageName) throws IOException, TemplateException {
        //模板文件
        String template_name = "serviceImpl.ftl";
        //输出文件名
        String outputClassName = className + "ServiceImpl.java";
        generateCode(className, template_name, outputClassName, packageName);
    }

    private static void generateService(String className, String packageName) throws IOException, TemplateException {
        //模板文件
        String template_name = "service.ftl";
        //输出文件名
        String outputClassName = "I" + className + "Service.java";
        generateCode(className, template_name, outputClassName, packageName);
    }

    private static void generateCode(String className, String template_name,
                                     String outputClassName, String packageName) throws IOException, TemplateException {

        String outputFilePath = "E:\\zkf\\project\\MyBase\\forjob\\src\\main\\java\\com\\zkf\\forjob\\output\\" + outputClassName;
        //生成serviceImpl
        doGenerateCode(template_path, template_name, outputFilePath, className, packageName);
    }


    private static void doGenerateCode(String template_path, String template_name,
                                       String outputFilePath, String className,
                                       String packageName) throws IOException, TemplateException {
        // 初始化Freemarker配置
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
        // 设置模板目录
        cfg.setDirectoryForTemplateLoading(new File(template_path)); // 指定模板文件夹路径

        // 加载模板
        Template template = cfg.getTemplate(template_name);

        // 创建数据模型
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("className", className); // 动态类名
        dataModel.put("package", packageName); // 动态包名
        // 生成Java文件
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            template.process(dataModel, fileWriter);
            System.out.println("Java file generated successfully at: " + outputFilePath);
        }
    }
}
