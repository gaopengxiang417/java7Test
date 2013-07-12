package com.gao.third;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 下午7:55
 */
public class AsynchronizedCallBackTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/logs/brand-crm-info.log");

        AsynchronousFileChannel asynchronousFileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer byteBuffer = ByteBuffer.allocate(100_000);

        asynchronousFileChannel.read(byteBuffer,0,byteBuffer,new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                System.out.println("already readed:"+result+" bytes");
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
                exc.printStackTrace();
            }
        });


        Path path1 = Paths.get("D:/test.txt");
        AsynchronousFileChannel asynchronousFileChannel1 = AsynchronousFileChannel.open(path1, StandardOpenOption.WRITE);

        String str = "this is a asynchronized file channel test" +
                "very thank you look this code,if you find any thing wrong" +
                "please contact us. our email is gaopengxiang417@163.com";

        ByteBuffer byteBuffer1 = ByteBuffer.allocate(str.getBytes().length);
        byteBuffer1.put(str.getBytes());
        byteBuffer1.flip();

        asynchronousFileChannel1.write(byteBuffer1,0,byteBuffer1,new CompletionHandler<Integer, Object>() {
            @Override
            public void completed(Integer result, Object attachment) {
                System.out.println(result);
                System.out.println("completed!");
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("error:"+exc.getMessage());
            }
        });
        asynchronousFileChannel1.force(true);
    }
}
