package statickeyworddemo;


public class StaticMethodDemo 
{
    public void m1()
    {
        System.out.println("m1 method");
    }
    
    public static void m2()
    {
        System.out.println("m2 method");
    }
    
    public static void main(String[] args) 
    {
        //Call non-static method with object reference.
        StaticMethodDemo smd1=new StaticMethodDemo();
        StaticMethodDemo smd2=new StaticMethodDemo();
        smd1.m1();
        
        //Call static method without creating object
        m2();
        StaticMethodDemo.m2();
    }
}
