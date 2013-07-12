package com.gao.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 上午11:02
 */
public class FileAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/result.txt");

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
        BasicFileAttributes basicFileAttributes = basicFileAttributeView.readAttributes();
        System.out.println("createtime:"+basicFileAttributes.creationTime()+",fileKey:"+basicFileAttributes.fileKey());
        System.out.println("isDirctory:"+basicFileAttributes.isDirectory()+",isOther:"+basicFileAttributes.isOther());
        System.out.println("isRegularFile"+basicFileAttributes.isRegularFile()+",isSymbolLink:"+basicFileAttributes.isSymbolicLink());
        System.out.println("lastModifiedtIME:"+basicFileAttributes.lastModifiedTime()+",lastAccessTime:"+basicFileAttributes.lastAccessTime());




    }
}
