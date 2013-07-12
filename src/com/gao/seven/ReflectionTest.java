package com.gao.seven;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: gaopengxiang
 * Date: 12-4-3
 * Time: 下午2:25
 */
public class ReflectionTest {
    public static void main(String[] args) throws Throwable, InvocationTargetException, IllegalAccessException {
        Class clazz = String.class;

        Method replaceMethod = clazz.getDeclaredMethod("replaceAll", new Class[]{String.class, String.class});

        Object result = replaceMethod.invoke("gaopengxiang", "a", "@");

        System.out.println(result);


        /*
        method 2 methodhandle
         */
        MethodType methodType = MethodType.methodType(String.class,String.class,String.class);

        MethodHandles.Lookup lookup = MethodHandles.lookup();

        MethodHandle methodHandle = lookup.findVirtual(String.class, "replaceAll", methodType);


        String returnValue = (String)methodHandle.invokeExact("gaopengxiang","a","@");

        assert(returnValue instanceof String);

        System.out.println(returnValue);
    }
}
