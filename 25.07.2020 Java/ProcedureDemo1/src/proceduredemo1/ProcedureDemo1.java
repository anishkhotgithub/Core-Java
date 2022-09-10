
package proceduredemo1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProcedureDemo1 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb?zeroDateTimeBehavior=convertToNull","root","root");
            CallableStatement cs=con.prepareCall("call getUsers()");
            ResultSet rs=cs.executeQuery();
            
            while(rs.next())
            {
                System.out.println("Username: "+rs.getString("username"));
                System.out.println("Email: "+rs.getString("email"));
                System.out.println("Password: "+rs.getString("password"));
                System.out.println("Role: "+rs.getString("role"));
                System.out.println("");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
