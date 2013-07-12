package com.ppt;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 上午9:39
 */
public class StringSwitchTwoTest {
    public static void main(String[] args) {
        String str = "hierarch";
        String str1 = "crinolines";
        System.out.println(str.hashCode() == str1.hashCode());
        int value = 0;
        switch (str) {
            case "crinolines":
                value = 1;
                break;
            case "hierarch":
                value = 2;
                break;
            default:
                value = 99;
        }

        System.out.println(value);
    }
}
