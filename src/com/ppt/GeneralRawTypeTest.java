package com.ppt;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * User: wangchen.gpx
 * Date: 13-7-9
 * Time: 下午10:52
 * 泛型在执行类型擦除后保留的原始类型，也就是最后在字节码中存在的类型变量的真正类型
 */
public class GeneralRawTypeTest {
    public static void main(String[] args) {
        Intellij objectIntellij = new Intellij();

        Field[] declaredFields = objectIntellij.getClass().getDeclaredFields();
        Class<?> componentType = objectIntellij.getClass().getComponentType();
        System.out.println(componentType);
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+":"+declaredField.getType());
            Type genericType = declaredField.getGenericType();
            System.out.println(genericType);
        }

        Method[] declaredMethods = objectIntellij.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+":"+declaredMethod.getReturnType());
        }
    }
}
class Intellij<T>{
    private T value;

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

//等价于下面的类型
/*
class Intellij{
    private Object value;

    Object getValue() {
        return value;
    }

    void setValue(Object value) {
        this.value = value;
    }
}*/
