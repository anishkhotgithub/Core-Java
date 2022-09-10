
package niodemo;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class NIODemo 
{
    public static void main(String[] args) throws IOException 
    {
        String pathString = "D:\\Recordings";
        Files.walkFileTree(Paths.get(pathString),new HashSet<>(), 2, new FileVisitor<Path>() 
        {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                    throws IOException {
                System.out.println("preVisitDirectory: " + dir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException {
                System.out.println("visitFile: " + file);
                //System.out.println("File Size: "+attrs.size());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc)
                    throws IOException {
                System.out.println("visitFileFailed: " + file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                    throws IOException {
                System.out.println("postVisitDirectory: " + dir);
                return FileVisitResult.CONTINUE;
                
            }
        });

    }
}
