
package synchronizeddemo;

public class MyClass extends Thread
{
    int i=1;
    
    @Override
    public void run() 
    {    
        synchronized(this)
        {
            for (i = 0; i < 10; i++) 
            {
                System.out.println(i);
            }
        }
    }
}
