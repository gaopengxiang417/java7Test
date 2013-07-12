package com.ppt;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午4:22
 */
public class BinaryLiteralTest {
    public static void main(String[] args) {

        //二进制的字面量,不带下划线的格式
        byte b = 0b00000001;
        System.out.println("b = "+b);

        //二进制的字面量,带下划线的格式
        int c = 0b0000_0010_0100;
        System.out.println("c = " + c);

        //十进制的字面量,带下划线的格式
        int i = 23_000_000;
        System.out.println("i = "+i);

        //下划线不能在开头或者结尾
//        int j = _232_22;
//        System.out.println("j = "+j);
    }
}
