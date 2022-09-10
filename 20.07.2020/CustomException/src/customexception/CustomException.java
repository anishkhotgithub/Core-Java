
package customexception;

public class CustomException 
{
    public static void main(String[] args) 
    {
        try
        {
            TestException te=new TestException();
            te.validate(12);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
