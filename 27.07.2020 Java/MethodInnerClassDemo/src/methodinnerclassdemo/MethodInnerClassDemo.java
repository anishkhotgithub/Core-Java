
package methodinnerclassdemo;

public class MethodInnerClassDemo 
{
    public void m1()
    {
        System.out.println("inside m1 method....");
        
        class InnerClass
        {
            public void m2()
            {
                System.out.println("inside m2 method....");
            }
        }  
        
        InnerClass ic=new InnerClass();
        ic.m2();
    }
    
    public static void main(String[] args) 
    {
        MethodInnerClassDemo micd=new MethodInnerClassDemo();
        micd.m1();
    }
}
