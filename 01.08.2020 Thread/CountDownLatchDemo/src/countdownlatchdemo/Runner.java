package countdownlatchdemo;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner extends Thread
{
    CountDownLatch cd;
    public Runner(String name,CountDownLatch cd) 
    {
        this.cd=cd;
        setName(name);
        start();
        System.out.println(name+" is ready and waiting to start the countdown");
    }

    @Override
    public void run() 
    {
        try 
        {
            cd.await();
        }
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        System.out.println(Thread.currentThread().getName()+" started running");
    }
}
