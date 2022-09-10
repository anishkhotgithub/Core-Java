
package localizationdemo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizationDemo 
{
    Scanner sc=new Scanner(System.in);
    Locale cn=Locale.CHINA;
    Locale fr=Locale.FRANCE;
    Locale sp=new Locale("ES","es");
    Locale current=Locale.getDefault();
        
    ResourceBundle rb=ResourceBundle.getBundle("myfile",current);
    
    double currency=10000;
    Date d=new Date();
    
    DateFormat df;
    NumberFormat nf;
        
    public void run()
    {
        String s="";
        while(!s.equals("q"))
        {
            menu();
            s=sc.next();
            
            switch(s)
            {
                case "1":
                    current=Locale.getDefault();
                    rb=ResourceBundle.getBundle("myfile",current);
                    break;
                case "2":
                    current=fr;
                    rb=ResourceBundle.getBundle("myfile",current);
                    break;
                case "3":
                    current=sp;
                    rb=ResourceBundle.getBundle("myfile",current);
                    break;
                case "4":
                    current=cn;
                    rb=ResourceBundle.getBundle("myfile",current);
                    break;
                case "5":
                    df=DateFormat.getDateInstance(DateFormat.DEFAULT,current);
                    System.out.println(df.format(d)+" "+current);
                    break;
                case "6":
                    nf=NumberFormat.getCurrencyInstance(current);
                    System.out.println(nf.format(currency)+" "+current);
                    break;
                
                default:
                    System.out.println("Invalid option!!!");
                    break;
            }
        }
    }
    public void menu()
    {
        System.out.println("======MENU========");
        System.out.println("1. "+rb.getString("m1"));
        System.out.println("2. "+rb.getString("m2"));
        System.out.println("3. "+rb.getString("m3"));
        System.out.println("4. "+rb.getString("m4"));
        System.out.println("5. "+rb.getString("m5"));
        System.out.println("6. "+rb.getString("m6"));
    }    
    
    public static void main(String[] args) 
    {
        LocalizationDemo ld=new LocalizationDemo();
        ld.run();
    }
}
