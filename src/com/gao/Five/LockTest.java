package com.gao.Five;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 上午9:09
 */
public class LockTest {
    public static void main(String[] args) {

        DeadClass deadClass = new DeadClass("first");
        DeadClass deadClass1 = new DeadClass("second");

        deadClass.firstMethod(deadClass1);
        deadClass1.seondMethod(deadClass);

    }
}
