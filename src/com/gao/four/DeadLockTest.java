package com.gao.four;

/**
 * User: gaopengxiang
 * Date: 12-3-31
 * Time: 下午8:26
 */
public class DeadLockTest {

    public static void main(String[] args) {
        final DeadMethod method1 = new DeadMethod("method1");
        final DeadMethod method2 = new DeadMethod("method2");


        new Thread(new Runnable() {
            @Override
            public void run() {
                method1.methodOne(method2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                method2.methodTwo(method1);
            }
        }).start();
    }
}
