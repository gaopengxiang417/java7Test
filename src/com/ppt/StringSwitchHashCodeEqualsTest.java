package com.ppt;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 上午9:39
 */
public class StringSwitchHashCodeEqualsTest {
    public static void main(String[] args) {
        String first = "hierarch";
        String second = "crinolines";

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        System.out.println("first.hashCode==second.hashCode : "+(first.hashCode() == second.hashCode()));
    }
}
