
package enumdemo;

public class EnumDemo 
{
    enum Departments
    {
        HR,
        SALES,
        IT
    }
    
    public static void getDepartment(Departments dep)
    {
        if(dep==Departments.HR)
        {
            //Code here if department hr
        }
        else if(dep==Departments.IT)
        {
            //Code here if department it
        }
        else if(dep==Departments.SALES)
        {
            //Code here if department it
        } 
    }
    
    public static void main(String[] args) 
    {
        getDepartment(Departments.HR);
    }
}
