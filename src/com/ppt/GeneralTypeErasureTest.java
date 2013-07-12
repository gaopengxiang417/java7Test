package com.ppt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * User: wangchen.gpx
 * Date: 13-7-9
 * Time: 下午10:34
 * 泛型的类型擦除类的说明,java中的泛型基本上都是在编译器层次来实现，在生成的字节码中是不包含
 * 泛型中的类型信息的
 */
public class GeneralTypeErasureTest {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("string");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(8);

        System.out.println(stringArrayList.getClass() == integerArrayList.getClass());
        //说明什么问题：

        //说明泛型添加的信息对JVM是不可见的，所以无法保证在运行时刻出现类型转换的问题


        //下面说明这个问题
        try {
            ArrayList<String> reflectiveList = new ArrayList<>();
            reflectiveList.add("first");
            Method add = reflectiveList.getClass().getMethod("add", Object.class);
            add.invoke(reflectiveList , 88);
            for (int i = 0, j = reflectiveList.size(); i < j; i++) {
                System.out.println(reflectiveList.get(i)); //强制类型转化的时候出现异常,看下get方法的源码
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e);
        }


        //我们通过反射来存储整型，说明了确实String泛型实例被擦除，只保留了原始类型ArrayList
    }
}


