package statickeyworddemo;

public class StaticVariableDemo 
{
    static int count=0;

    public StaticVariableDemo() 
    {
        count++;
        System.out.println(count);
    }
    
    public static void main(String[] args) 
    {
        StaticVariableDemo svd1=new StaticVariableDemo();
        StaticVariableDemo svd2=new StaticVariableDemo();
        StaticVariableDemo svd3=new StaticVariableDemo();
    }
    
}
