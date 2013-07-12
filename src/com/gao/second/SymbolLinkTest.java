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
 * Time: 下午2:30
 */
public class SymbolLinkTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/result.txt");
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
        BasicFileAttributes basicFileAttributes = basicFileAttributeView.readAttributes();
        boolean isSymbolLink = basicFileAttributes.isSymbolicLink();
        if (isSymbolLink) {
            Path realPath = Files.readSymbolicLink(path);

            boolean isSame = Files.isSameFile(path,path.resolve(realPath));
            assert isSame;
        }

    }
}
