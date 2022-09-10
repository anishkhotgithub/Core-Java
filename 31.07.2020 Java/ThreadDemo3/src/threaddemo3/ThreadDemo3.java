
package threaddemo3;

public class ThreadDemo3 
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyClass m1=new MyClass();
        MyClass m2=new MyClass();
     
        m1.start();
        m1.join();
        m2.start();
    }
}
