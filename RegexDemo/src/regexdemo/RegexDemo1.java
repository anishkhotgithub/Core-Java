
package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 
{
    String s="it was the best of times wbs";
    
    // dot represents single character
    public void pattern1()
    {   
        Pattern p=Pattern.compile("w.s");
        Matcher m=p.matcher(s);
        
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //any one character from given brackets
    public void pattern2()
    {       
        Pattern p=Pattern.compile("w[abc]s");
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    //any one alphabet from given range
    //this pattern is case insensitive
    public void pattern3()
    {     
        Pattern p=Pattern.compile("w[a-z]s",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    
    //No character from given brackets
    public void pattern4()
    {       
        Pattern p=Pattern.compile("t[^eou]mes");
        Matcher m=p.matcher(s);
        
        if(m.find())
        {
            System.out.println(m.group());
        }
    }
    
    public static void main(String[] args) 
    {
        RegexDemo1 rd=new RegexDemo1();
        rd.pattern1();
        
    }
}
