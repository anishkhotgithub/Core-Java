
package proceduredemo2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProcedureDemo2 
{
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the username");
            String username=sc.next();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb?zeroDateTimeBehavior=convertToNull","root","root");
            
            CallableStatement cs=con.prepareCall("call getUserData(?)");
            cs.setString(1, username);
            ResultSet rs=cs.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Username: "+rs.getString("username"));
                System.out.println("Email: "+rs.getString("email"));
                System.out.println("Role: "+rs.getString("role"));
                System.out.println("Password: "+rs.getString("password"));
                System.out.println("");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
