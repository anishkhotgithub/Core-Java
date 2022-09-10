
package threaddemo1;

public class ThreadDemo1 
{
    public static void main(String[] args) 
    {
        System.out.println("thread start");
        MyClass m1=new MyClass();
        m1.start();
        System.out.println("thread end");
    }
}
