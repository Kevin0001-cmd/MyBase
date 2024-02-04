package com.zkf.factory.sample.javaSample;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 21:08
 * @Description: 拓展：Calendar获取的时间实际上是服务器所在地区的时间。
 * 例如，我的电脑如果将时间设置为阿拉斯加的话，显示的就不是北京时间。不然的话，因为我的电脑设置的是北京时间，无论我设置的是哪个时区和位置，显示的都是北京时间。
 */
public class calendarFactory {
    @Test
    public void test() {
        //使用默认的时区、默认的位置创建实例
        Calendar c1 = Calendar.getInstance();
        //使用指定的时区、默认的位置创建实例
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        //使用默认的时区、指定的位置创建实例
        Calendar c3 = Calendar.getInstance(Locale.CHINA);
        //使用指定的时区、指定的位置创建实例
        Calendar c4 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"), Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date t1 = c1.getTime();
        Date t2 = c2.getTime();
        Date t3 = c3.getTime();
        Date t4 = c4.getTime();
        System.out.println(sdf.format(t1));
        System.out.println(sdf.format(t2));
        System.out.println(sdf.format(t3));
        System.out.println(sdf.format(t4));
        System.out.println(c1.getFirstDayOfWeek());
    }
}
