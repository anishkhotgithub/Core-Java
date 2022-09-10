
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo 
{
    //serialize
    public static void addUser()
    {
        try(FileOutputStream fos=new FileOutputStream("E:\\New Folder\\userdetails.txt");
            ObjectOutputStream os=new ObjectOutputStream(fos);)
        {
            User u=new User();
            os.writeObject(u);
            System.out.println("User Data saved successfully!!!");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }    
    }
    
    //deserialize
    public static void getUser()
    {
        try (FileInputStream fis=new FileInputStream("E:\\New Folder\\userdetails.txt");
                ObjectInputStream ois=new ObjectInputStream(fis);)
        {
            User u=(User)ois.readObject();
            
            System.out.println("Userid: "+u.userid);
            System.out.println("Username: "+u.username);
            System.out.println("Password: "+u.password);
            System.out.println("Confirm Password: "+u.confirmpassword);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) 
    {
        //addUser();
        getUser();
    }
}
