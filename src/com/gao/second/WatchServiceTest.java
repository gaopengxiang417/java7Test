package com.gao.second;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 * User: gaopengxiang
 * Date: 12-3-30
 * Time: 下午2:51
 */
public class WatchServiceTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();

        Path path = Paths.get("D:");

        WatchKey watchKey = path.register(watchService,StandardWatchEventKinds.ENTRY_MODIFY);
        while(true){
            watchKey = watchService.take();
            List<WatchEvent<?>> list = (List<WatchEvent<?>>) watchKey.pollEvents();

           for(WatchEvent event : list){
               if(event.kind() == StandardWatchEventKinds.ENTRY_MODIFY){
                   System.out.println("the file has already changed!");
                   System.out.println(event.context());
                   System.out.println(event.count());
                   watchKey.reset();
               }
           }
            break;
        }
    }
}
