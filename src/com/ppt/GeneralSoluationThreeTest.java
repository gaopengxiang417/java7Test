package com.ppt;

import java.util.ArrayList;
import java.util.Date;

/**
 * User: wangchen.gpx
 * Date: 13-7-9
 * Time: 下午11:48
 * 主要是验证泛型是加到引用上还是加到new对象上
 */
public class GeneralSoluationThreeTest {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("china"); // OK
//        listOne.add(33);// ERROR
        String str = listOne.get(0); //返回为String类型


        ArrayList listTwo = new ArrayList<String>();
        listTwo.add("china"); //OK
        listTwo.add(43); //OK
        listTwo.add(new Date()); //ok
        Object obj = listTwo.get(0); //返回为Object
    }
}
