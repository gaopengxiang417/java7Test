package com.gao.Five;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 上午9:39
 */
public class NonDeadLockClass {
    private final String name;
    private Lock lock = new ReentrantLock();

    public NonDeadLockClass(String name) {
        this.name = name;
    }

    public void firstMethod(NonDeadLockClass nonDeadLockClass) {
        String printValue = this.name + " start:" + nonDeadLockClass.getName();
        System.out.println(printValue);
        boolean isGet = false;
        boolean isDone = false;
        while(!isDone) {
            try {
                isGet = lock.tryLock(3, TimeUnit.SECONDS);
                if(isGet){
                    isDone = nonDeadLockClass.secondMethod(this);
                }
            } catch (InterruptedException e) {

            }finally {
                lock.unlock();
            }
            if(!isDone){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public boolean secondMethod(NonDeadLockClass nonDeadLockClass) {
        boolean isGet = false;
        try{
            int waitTime = (int) Math.random() * 10;
            isGet = lock.tryLock(waitTime, TimeUnit.SECONDS);

            if(isGet){
                nonDeadLockClass.firstMethod(this);
                return true;
            }

        } catch (InterruptedException e) {
        }finally {
            if (isGet) {
                lock.unlock();
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
