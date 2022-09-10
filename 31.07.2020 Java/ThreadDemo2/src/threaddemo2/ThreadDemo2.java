
package threaddemo2;

public class ThreadDemo2 
{
    public static void main(String[] args) 
    {
        System.out.println("thread started");
        MyClass m1=new MyClass();
        Thread t1=new Thread(m1);
        t1.start();
        System.out.println("thread end");
    }
}
