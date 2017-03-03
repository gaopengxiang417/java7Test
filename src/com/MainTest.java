package com;

import java.util.HashMap;

/**
 * User: wangchen.gpx
 * Date: 13-7-12
 * Time: 下午5:14
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {

        HashMap<String, Boolean> hashMap = new HashMap<>();

        System.out.println(hashMap != null ? hashMap.get("test") : false);


        while(true){

            System.out.println("first line");
            System.out.println("second line");
            Thread.sleep(3000);
            System.out.println("third line");
        }

        /*while (true) {

            Student student = new Student();
            System.out.println(student);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

    public static void test(){
        System.out.println("444");
        System.out.println("last");
        System.out.println("add method");
    }
}
class Student{
    private int age;

    public String name = "23";

    @Override
    public String toString() {
        return "this is a "+name+"end test zhaofabing";
    }
}
