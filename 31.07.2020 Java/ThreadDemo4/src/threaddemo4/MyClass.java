package threaddemo4;

public class MyClass extends Thread
{
    @Override
    public void run() 
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);
            
            try 
            {
                Thread.currentThread().sleep(1000);
            }
            catch (InterruptedException ex) 
            {
                System.out.println(ex);
            }
        }
    }
}
