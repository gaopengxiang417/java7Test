package com.gao.second;

import java.io.IOException;
import java.nio.file.*;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 下午3:22
 */
public class ListDirectoryTest {
    public static void main(String[] args) {
        String pathString = "D:/project";


        Path path = Paths.get(pathString);

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            for(Path entry : directoryStream){
                System.out.println(entry+":"+Files.isDirectory(entry, LinkOption.NOFOLLOW_LINKS));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path,new DirectoryStream.Filter<Path>(){

            @Override
            public boolean accept(Path entry) throws IOException {
                if(Files.isDirectory(entry,LinkOption.NOFOLLOW_LINKS)){
                    return true;
                }
                return false;
            }
        })) {
            for(Path entry : directoryStream){
                System.out.println(entry +":"+Files.isDirectory(path,LinkOption.NOFOLLOW_LINKS));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
