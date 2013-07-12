package com.gao.six;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 下午4:10
 */
public class SchudleExcutorThreadpoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task1 scheduled");
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task2 scheduled");
            }
        };

        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(task1, 0, TimeUnit.SECONDS);
        if(scheduledFuture.isDone()){
            System.out.println("first task completed");
        }

        final ScheduledFuture<?> scheduledFuture1 = scheduledExecutorService.scheduleAtFixedRate(task2, 5, 5, TimeUnit.MILLISECONDS);

        stop(scheduledExecutorService, scheduledFuture1);


    }

    private static void stop(ScheduledExecutorService scheduledExecutorService, final ScheduledFuture<?> scheduledFuture1) {
        scheduledExecutorService.schedule(new Runnable() {
            ScheduledFuture<?> future = scheduledFuture1;
            @Override
            public void run() {
                future.cancel(true);
            }
        },20,TimeUnit.MILLISECONDS);

        scheduledExecutorService.shutdown();
    }
}
