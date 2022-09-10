
package threaddemo5;

public class ThreadDemo5 
{
    public static void main(String[] args) 
    {
        MyClass m1=new MyClass();
        MyClass m2=new MyClass();
        
        //Bydefault thread has names thread 0 & thread 1
        m1.setName("Rahul");
        m2.setName("Rohit");
        
        m1.start();
        m2.start();
    }
}
