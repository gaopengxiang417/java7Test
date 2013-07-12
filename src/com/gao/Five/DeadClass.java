package com.gao.Five;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 上午9:10
 */
public class DeadClass {
    private final String name;
    private Lock lock = new ReentrantLock();

    public DeadClass(String name) {
        this.name = name;
    }

    public void firstMethod(DeadClass deadClass){
        System.out.println(this.name+" start :"+deadClass.getName());
        lock.lock();
        try {
            deadClass.seondMethod(this);
        } finally {
            lock.unlock();
        }
        System.out.println("complete");
    }

    public void seondMethod(DeadClass deadClass) {
        System.out.println(this.name+" start:"+deadClass.getName());
        lock.lock();
        try {
            deadClass.firstMethod(this);
        } finally {
            lock.unlock();
        }
        System.out.println("complete");
    }

    public String getName() {
        return name;
    }
}
