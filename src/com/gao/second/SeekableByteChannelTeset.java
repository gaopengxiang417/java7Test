package com.gao.second;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.Files.newByteChannel;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 下午6:43
 */
public class SeekableByteChannelTeset {
    public static void main(String[] args) {
        String pathString = "D:/logs/brand-crm-info.log";
        Path path = Paths.get(pathString);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        try {
            SeekableByteChannel seekableByteChannel = newByteChannel(path, StandardOpenOption.READ);
            long position = seekableByteChannel.position();
            System.out.println(position);
            {
                System.out.println(getSize(seekableByteChannel));
            }


            /*int location = 0;
            StringBuffer sb = new StringBuffer();
            while ((location = seekableByteChannel.read(byteBuffer)) != -1) {
                sb.append(byteBuffer);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long getSize(SeekableByteChannel seekableByteChannel) throws IOException {
        return seekableByteChannel.size();
    }
}
