package com.zkf.classDemo;

import com.zkf.classDemo.util.OracleUtil;
import com.zkf.classDemo.vo.User;
import org.junit.Test;
import com.zkf.classDemo.util.DBUtil;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Date;

/**
 * 任务：如果获取一个泛型类的泛型信息？
 * 解决：因为是需要从对象获取，所以可以在类内部保存一个type来获取类型信息:test_MySQL()
 * 又或者使用匿名内部类来获取超类的泛型类型:test_Orcale()
 */
public class classDemo {


    /**
     * 匿名内部类会保存泛型信息，所以加上{}后，可以直接获取类型
     */
    @Test
    public void test_generic_superclass() {
        new DBUtil<User>() {
        }.getType();
    }

    /**
     * 如果不加{}就无法获取泛型信息，因为java有类型擦除机制
     * 泛型类型在运行阶段会被擦除掉，此时无法获取泛型类型
     * Java泛型是在编译时进行类型检查的，而在运行时泛型信息会被擦除。
     * 如果你需要获取一个普通对象的泛型信息，一种常见的做法是在创建对象时保存一个类型标记
     * <p>
     * 如果一个匿名内部类里面什么都不写，是不是相当于没有这个匿名内部类？
     * 如果一个匿名内部类里面什么代码都不写（即没有任何方法实现），那么它的存在确实可能看起来有些多余。
     * 但是，即使不包含任何额外的代码，匿名内部类仍然有其意义，因为它定义了一个具体的类，这个类继承了指定的父类或实现了指定的接口，并且具有特定的泛型类型。
     */
    @Test
    public void test_MySQL() {
        DBUtil<User> userDBUtil = new DBUtil<User>() {
        };
        User user = User.builder().id(1).name("test").sex("male").build();
        userDBUtil.save(user);
    }

    @Test
    public void test_Orcale() {
        OracleUtil<User> oracleUtil = new OracleUtil<>(new User());
        User user = User.builder().id(1).name("test").sex("male").build();
        oracleUtil.save(user);
    }
}
