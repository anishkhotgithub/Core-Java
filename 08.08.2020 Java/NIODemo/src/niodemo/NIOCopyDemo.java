package niodemo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.List;

public class NIOCopyDemo 
{
    public void copyDemo() throws Exception
    {
        Path p1=Paths.get("D:\\New folder\\a.txt");
        Path p2=Paths.get("D:\\New folder\\b.txt");
        
        Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully!!!");
    }
    
    public void moveDemo() throws Exception
    {
        Path p1=Paths.get("D:\\New folder\\b.txt");
        Path p2=Paths.get("D:\\New folder (2)\\b.txt");
        
        Files.move(p1, p2);
        System.out.println("File Moved successfully!!!");
    }
    
    public void deleteDemo() throws Exception
    {
        Path p=Paths.get("D:\\New folder (2)\\b.txt");
        //Files.delete(p);
        
        if(Files.deleteIfExists(p))
        {
            System.out.println("File Deleted Successfully!!!");
        }
        else
        {
            System.out.println("File Not Found!!!");
        }
    }
    
    public void readData() throws Exception
    {
        Path p=Paths.get("D:\\userdata.txt");
        List<String> lines=Files.readAllLines(p);
        
        for (String line : lines) 
        {
            System.out.println(line);
        }
    }
    
    public void readFiles() throws Exception
    {
        Path p=Paths.get("E:\\Asfa\\Oracle");
        DirectoryStream<Path> files=Files.newDirectoryStream(p,"*.pps");
        
        for (Path file : files) 
        {
            System.out.println(file.getFileName());
        }
    }
    
    public void readFileInformation() throws Exception
    {
        Path p=Paths.get("E:\\Asfa\\Oracle\\join3table.png");
        DosFileAttributes obj=Files.readAttributes(p,DosFileAttributes.class);
        
        System.out.println("Size: "+obj.size());
        System.out.println("Access Time: "+obj.lastAccessTime());
        System.out.println("Modification Time: "+obj.lastModifiedTime());
        System.out.println("Hidden: "+obj.isHidden());
        System.out.println("Readonly: "+obj.isReadOnly());
        System.out.println("Archive: "+obj.isArchive());
        System.out.println("System: "+obj.isSystem());
        System.out.println("Directory: "+obj.isDirectory());
    }

    public void pathDemo()
    {
        //URL -> Uniform Resource Locator       (websites)
        //URI -> Uniform Resource Indicator     (any physical path)
        
        //Absolute Path -> complete path (with root directory eg. C:\\program files\\myfile.txt)
        //Relative Path -> partial  path (without root directory eg.  john\\userdata.txt)
        
        //..            -> parent  directory
        //.             -> current directory
        Path p=Paths.get("D:\\abc\\john\\..\\foo\\a.txt");
        
        System.out.println(p.getFileName());
        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        System.out.println(p.getNameCount());
        System.out.println(p.getName(2));
        System.out.println(p.isAbsolute());
        System.out.println(p.toAbsolutePath());
        System.out.println(p.subpath(1, 3));
        System.out.println(p.normalize());          //remove redundant element
       
        Path p1=Paths.get("abc\\foo");
        Path p2=Paths.get("john\\james");
        
        Path p1top2=p1.relativize(p2);
        Path p2top1=p2.relativize(p1);
        
        System.out.println(p1top2);
        System.out.println(p2top1);
    }
    
    public static void main(String[] args) 
    {
        try
        {
            NIOCopyDemo ncd=new NIOCopyDemo();
            //ncd.copyDemo();
            //ncd.moveDemo();
            //ncd.deleteDemo();
            //ncd.readData();
            //ncd.readFiles();
            //ncd.readFileInformation();
            ncd.pathDemo();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
