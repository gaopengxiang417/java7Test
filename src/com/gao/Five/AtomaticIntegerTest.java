package com.gao.Five;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 上午8:58
 */
public class AtomaticIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(3);

        System.out.println(atomicInteger.get());

        int first = atomicInteger.addAndGet(3);
        System.out.println(first);

        boolean isSuccess = atomicInteger.compareAndSet(6, 9);
        System.out.println(isSuccess);

        int second = atomicInteger.decrementAndGet();
        System.out.println(second);

        int third = atomicInteger.getAndSet(4);
        System.out.println(third);


    }
}
