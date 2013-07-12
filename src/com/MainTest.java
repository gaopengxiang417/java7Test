package com;

/**
 * User: wangchen.gpx
 * Date: 13-7-12
 * Time: 下午5:14
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("5445");
        System.out.println("22");

        test();

        Student student = new Student();
        System.out.println(student);
    }

    public static void test(){
        System.out.println("444");
        System.out.println("last");
    }
}
class Student{
    private int age;

    public String name = "23";

    @Override
    public String toString() {
        return name;
    }
}
