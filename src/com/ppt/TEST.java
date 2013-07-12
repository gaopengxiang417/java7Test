package com.ppt;

/**
 * User: wangchen.gpx
 * Date: 13-7-12
 * Time: 下午2:27
 */
public class TEST {
    public static void main(String[] args) {
        System.out.println("io".hashCode());
        String name = "b";
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
