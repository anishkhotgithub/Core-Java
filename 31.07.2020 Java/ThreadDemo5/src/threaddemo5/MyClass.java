package threaddemo5;

public class MyClass extends Thread
{
    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getName()+" started");
    }
}
