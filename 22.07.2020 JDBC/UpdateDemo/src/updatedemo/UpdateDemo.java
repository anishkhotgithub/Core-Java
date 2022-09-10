
package updatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employee id");
            int employeeid=sc.nextInt();
            
            System.out.println("Enter new employee name");
            String employeename=sc.next();
                    
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/demo","demo","demo");
            
            PreparedStatement ps=con.prepareStatement("update employees set employeename=? where employeeid=?");
            ps.setString(1, employeename);
            ps.setInt(2, employeeid);
            ps.executeUpdate();
            System.out.println("Data updated successfully!!!");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
