package com.gao.second;

import java.io.IOException;
import java.nio.file.*;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 上午10:05
 */
public class FileSystemFirstTest {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();
        Path logPath = fileSystem.getPath("D:/logs/brand-crm-debug.log");
        Path destinationPath = fileSystem.getPath("D:/first/");

        boolean isReadable = Files.isReadable(logPath);
        boolean isWritable = Files.isWritable(logPath);

        System.out.println("logPath is readable:"+isReadable);
        System.out.println("logPath is writable:"+isWritable);

        FileStore fileStore = Files.getFileStore(logPath);
        if (fileStore.type() == "NAIFS") {
            throw new IOException("wrong location");
        }

        CopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
        Files.copy(logPath,destinationPath,copyOption);


    }
}
