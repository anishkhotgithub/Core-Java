package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 
{
    String s="Longlonglong ago, in a galaxy far far away";
    
    //The previous character should repeat exact three times.
    public void pattern1()
    {
        Pattern p=Pattern.compile("gal.{3}");
        
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //The previous character should repeat atleast three times and maximum 5 times.
    public void pattern2()
    {
        Pattern p=Pattern.compile("gal.{3,5}");
        
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //The previous character should repeat 3 or all possible characters.
    public void pattern3()
    {
        Pattern p=Pattern.compile("gal.{3,}");
        
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //The previous character should repeat zero or more times.
    public void pattern4()
    {
        Pattern p=Pattern.compile("gal.*");
        
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //The previous character should repeat one or more times.
    public void pattern5()
    {
        Pattern p=Pattern.compile("gal.+");
        
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern6()
    {
        Pattern p=Pattern.compile("gal.*far");
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public void pattern7()
    {
        Pattern p=Pattern.compile("gal.*?far");
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //previous word repeat exact 2 times.
    public void pattern8()
    {
        Pattern p=Pattern.compile("(long){2}");
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public static void main(String[] args) 
    {
        RegexDemo3 rd=new RegexDemo3();
        rd.pattern8();
    }
}
