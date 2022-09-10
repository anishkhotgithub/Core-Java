
package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        //Checked Exception   - File IO, Database
        //Unchecked Exception - Arithmetic, InputMismatch
        
        try
        {
            Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter first number");
            int a=sc.nextInt();
        
            System.out.println("Enter second number");
            int b=sc.nextInt();
        
            int c=a/b;
        
            System.out.println("Sum: "+(a+b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}
