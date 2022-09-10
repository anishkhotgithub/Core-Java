package regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation 
{
    /*
        WAP in java to accept mobile number from user and check
        whether it is valid or not.
    */
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile number");
        String mobile=sc.next();
        
        Pattern p=Pattern.compile("^\\d{10}$");
        Matcher m= p.matcher(mobile);
        
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("mobile number is valid");
        }
        else
        {
            System.out.println("mobile number is invalid");
        }
    }
}
