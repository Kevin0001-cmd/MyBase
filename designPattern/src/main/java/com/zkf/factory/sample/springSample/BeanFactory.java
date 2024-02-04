package com.zkf.factory.sample.springSample;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 14:03
 * @Description:
 * 简单工厂：
 *   Spring中的BeanFactory使用的就是简单工厂方法，虽然看起来不是，但同一个方法名中传入不同类型的参数以获得bean，从思想上来说就是一种简单工厂
 * 工厂模式体现在：BeanFactory有许多的实现类，例如：DefaultListableBeanFactory、XmlBeanFactory等。这些类扩展了BeanFactory，实现了Bean的解析、加载、创建，
 *  不同的子类可以按照特定的方式管理Bean的生命周期，从而实现了工厂方法模式的多态性创建对象的特点。
 *  我的理解：工厂方法模式最重要的就是创建了不同类型的工厂类，然后通过这些工厂类可以调用其中的方法。再看Spring中，BeanFactory可以视为一个工厂类的接口，定义了基本的规范，
 * 它的实现类就是一个个具体工厂，创建的时候可以创建不同的工厂来调用里面的方法。
 *
 */
public interface BeanFactory {
    Object getBean(String name);

    Object getBean(String name, Object... args);

    <T> T getBean(String name, Class<T> requiredType);

    <T> T getBean(Class<T> requiredType);
}
