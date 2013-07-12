package com.ppt;

import java.util.ArrayList;

/**
 * User: wangchen.gpx
 * Date: 13-7-9
 * Time: 下午11:34
 * 说明泛型是在编译前进行检查，如果在编译后检查，原始类型为Object，就不会出现编译错误了
 */
public class GeneralSoluationOneTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("china");
//        arrayList.add(33);//出现编译错误
    }
}
