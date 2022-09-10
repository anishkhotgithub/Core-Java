package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Metacharacters

    \\d - digit
    \\D - non-digit
    \\s - white space
    \\S - non-white space
    \\w - alphanumeric
    \\W - non-alphanumeric
*/

public class RegexDemo2 
{
    String s="Joe told me 2 ways to san jose in 20 minutes @";
    
    public void pattern1()
    {
        Pattern p=Pattern.compile("\\d");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern2()
    {
        Pattern p=Pattern.compile("\\D\\D");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern3()
    {
        Pattern p=Pattern.compile("\\sin\\s");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern4()
    {
        Pattern p=Pattern.compile("\\Sin\\S");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern5()
    {
        Pattern p=Pattern.compile("\\w\\w");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern6()
    {
        Pattern p=Pattern.compile("\\W\\W");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public static void main(String[] args) 
    {
        RegexDemo2 rd=new RegexDemo2();
        rd.pattern6();
    }
}
