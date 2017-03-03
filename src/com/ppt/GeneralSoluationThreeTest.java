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
        // OK
        listOne.add("china");
        // ERROR
//      listOne.add(33);
        //返回为String类型
        String str = listOne.get(0);


        ArrayList listTwo = new ArrayList<String>();
        //OK
        listTwo.add("china");
        //OK
        listTwo.add(43);
        //ok
        listTwo.add(new Date());
        //返回为Object
        Object obj = listTwo.get(0);
    }
}
