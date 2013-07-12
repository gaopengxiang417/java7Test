package com.gao.test;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午4:22
 */
public class NumberTest {
    public static void main(String[] args) {

        int i = Integer.parseInt("00000011", 2);
        System.out.println(i);

        int j = 0b00000001;
        int x = 0x00000001;
        System.out.println(j +":"+x);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

//        System.out.println(Integer.parseInt(String.valueOf(Character.MAX_VALUE)));
        System.out.println(":"+Character.MIN_VALUE+":");
        
        System.out.println("china");
        

        int a = 23_232_33;
        System.out.println(a);
        int bitValue = 0b0000_0000_0010;
        System.out.println(bitValue);
    }
}
