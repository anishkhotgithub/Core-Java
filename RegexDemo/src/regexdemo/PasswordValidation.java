package regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation 
{
    /*
        WAP in java to accept password from user and check below conditions
        for strong password.
    
        Password should contain atleast
    
        1) one lowercase alphabet
        2) one uppercase alphabet
        3) on digit
        4) one special character.
    
        total length of password between 8 to 16.
    */
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password");
        String password=sc.next();
        
        Pattern p=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]).{8,16}");
        Matcher m=p.matcher(password);
        
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("password is strong");
        }
        else
        {
            System.out.println("password is weak");
        }
    }
}
