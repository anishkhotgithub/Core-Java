package customexception;

public class TestException 
{
    public void validate(int age) throws InvalidAgeException
    {
        if(age<18)
            throw new InvalidAgeException("Invalid AGe");
    }
}
