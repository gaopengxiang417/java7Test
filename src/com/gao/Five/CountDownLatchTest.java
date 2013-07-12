package com.gao.Five;

import java.util.concurrent.CountDownLatch;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 上午10:13
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String[] names = {"first", "second", "third", "forth", "fifth", "sixth"};
        for(String name : names){
            new Thread(new Worker(name,countDownLatch)).start();
        }
        countDownLatch.countDown();

    }
    public static class Worker implements Runnable{

        private CountDownLatch countDownLatch;
        private String name;

        public Worker(String name,CountDownLatch countDownLatch) {
            this.name = name;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                System.out.println(name+" :start await........");
                countDownLatch.await();
                System.out.println(name+" :completed .....");
            } catch (InterruptedException e) {
                System.out.println("some esception occured:"+e.getMessage());
            }
        }
    }
}
