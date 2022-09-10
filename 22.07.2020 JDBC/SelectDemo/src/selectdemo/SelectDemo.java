
package selectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/demo","demo","demo");
            
            //PreparedStatement ps=con.prepareStatement("select * from employees");
            //ResultSet rs=ps.executeQuery();
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from employees");
            
            while(rs.next())
            {
                System.out.println("Employee Id: "+rs.getInt("employeeid"));
                System.out.println("Employee Name: "+rs.getString(2));
                System.out.println("");
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
