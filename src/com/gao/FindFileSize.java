package com.gao;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * User: wangchen.gpx
 * Date: 13-6-26
 * Time: 上午10:34
 */
public class FindFileSize {
    public static long size = 0;
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        Path path = Paths.get("D:\\project\\prm\\Tanx广告位优化项目");
        Files.walkFileTree(path,new MyFileVisitor());
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(size);
    }

    public static class MyFileVisitor implements FileVisitor<Path>{

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if(!Files.isDirectory(file)) {
                size += Files.size(file);
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            if (exc != null) {
                System.out.println("some error..."+exc.getMessage());
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }
    }
}
