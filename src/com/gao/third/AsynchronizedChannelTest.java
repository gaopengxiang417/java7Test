package com.gao.third;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 下午7:38
 */
public class AsynchronizedChannelTest {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        Path path = Paths.get("D:/logs/brand-crm-info.log");

        AsynchronousFileChannel asynchronousFileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer byteBuffer = ByteBuffer.allocate(100_00);

        Future<Integer> future = asynchronousFileChannel.read(byteBuffer, 0);

        while (!future.isDone()) {
            System.out.println("the work has not completed!");
            Thread.sleep(5000);
        }

        Integer count = future.get();
        StringBuffer sb = new StringBuffer();
        System.out.println(count);
        System.out.println(sb.append(byteBuffer.array()).toString());
    }
}
