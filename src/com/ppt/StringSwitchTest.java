package com.ppt;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 上午9:39
 */
public class StringSwitchTest {
    public static void main(String[] args) {
        String name = new String("b");
        int value = 0;
        switch (name) {
            case "1":
                value = 1;
                break;
            case "b":
                value = 2;
                break;
            case "c":
                value = 3;
                break;
            case "d":
                value = 4;
                break;
            case "io":
                value = 5;
                break;
            default:
                value = 6;
        }

        System.out.println(value);
    }
}
