
package assertiondemo;

import java.util.Scanner;

public class AssertionDemo 
{
    public static void main(String[] args) 
    {
        /*
            Goto run tab
            Set Project Configuration
            Customize
            Type -ea or -enableassertions in VM Options.
            Click Ok
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        
        assert age>=18;
        
        System.out.println("Next Step........");
    }
}
