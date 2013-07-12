package com.gao.second;

import java.io.IOException;
import java.nio.file.*;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 上午10:24
 */
public class CpoyAndMoveFileTest {
    public static void main(String[] args) throws IOException {
        Path sourcePath = Paths.get("D:/logs/brand-crm-error.log");

        String destString = "D:result.txt";
        Path descPath = FileSystems.getDefault().getPath(destString);

        Files.copy(sourcePath,descPath, StandardCopyOption.REPLACE_EXISTING);


        Files.move(sourcePath,descPath,StandardCopyOption.REPLACE_EXISTING);
    }
}
