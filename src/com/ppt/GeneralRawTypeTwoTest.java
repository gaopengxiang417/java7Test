package com.ppt;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * User: wangchen.gpx
 * Date: 13-7-9
 * Time: 下午11:14
 * 类型边界的实例
 */
public class GeneralRawTypeTwoTest {
    public static void main(String[] args) {
        ExtendClass extendClass = new ExtendClass();

        Field[] declaredFields = extendClass.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName() + " : " + declaredField.getType());
        }

        Method[] declaredMethods = extendClass.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + " : " + declaredMethod.getReturnType());
        }
    }
}

class ExtendClass<T extends Comparable>{
    private T value;

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}
