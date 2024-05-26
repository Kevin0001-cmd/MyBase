package com.zkf.ormdemo.reader;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ReaderTest {

    @GetMapping("/sax")
    public void sax() {
        String packageSearchPath = "classpath:mapper/*.xml";
        try {
            // 解析classpath路径上的文件
            ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//            Resource[] resources = new Resource[0];
            Resource[] resources = resourcePatternResolver.getResources(packageSearchPath);
//            List<Element> list = new ArrayList<>(resources.length);
            for (Resource resource : resources) {
                Document document = new SAXReader().read(new InputSource(new InputStreamReader(resource.getInputStream())));
//                list.add(document.getRootElement());
                Element rootElement = document.getRootElement();
                iterateElements(rootElement);
                System.out.println("---------------------------");
                // 打印或进一步处理 Document 对象...
                System.out.println(document.asXML());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 递归遍历元素的辅助方法
    private static void iterateElements(Element element) {
        // 处理当前元素
        System.out.println("Element Name: " + element.getName());

        // 遍历子元素
        for (Object child : element.elements()) {
            if (child instanceof Element) {
                iterateElements((Element) child);
            }
        }
    }
}
