package com.gao.Five;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 上午9:39
 */
public class SolveDeadLock {
    public static void main(String[] args) {
        NonDeadLockClass first = new NonDeadLockClass("first");
        NonDeadLockClass second = new NonDeadLockClass("second");

        first.firstMethod(second);
        second.secondMethod(first);
    }
}
