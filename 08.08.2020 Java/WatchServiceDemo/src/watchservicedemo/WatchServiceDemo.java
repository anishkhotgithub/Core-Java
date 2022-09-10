
package watchservicedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Date;

public class WatchServiceDemo 
{
    public static void main(String[] args) throws Exception 
    {
        WatchService watchService = FileSystems.getDefault().newWatchService();//1 folder
 
        Path p = Paths.get("D:\\folder\\");
 
        p.register(
          watchService, 
            StandardWatchEventKinds.ENTRY_CREATE, 
              StandardWatchEventKinds.ENTRY_DELETE, 
                StandardWatchEventKinds.ENTRY_MODIFY);
 
        
        
        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt",true));
                
                System.out.println(
                  "Event kind:" + event.kind() 
                    + ". File affected: " + event.context() + ".");
                
                
                bw.write("Event kind:" + event.kind() 
                    + ". File affected: " + event.context() + " "+new Date());
                bw.newLine();
                bw.close();
            }
            key.reset();
        }
        
    }
}
