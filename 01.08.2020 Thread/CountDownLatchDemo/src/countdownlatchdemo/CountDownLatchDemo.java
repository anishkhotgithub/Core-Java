
package countdownlatchdemo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {
        CountDownLatch cd=new CountDownLatch(5);
        new Runner("Suhas", cd);
        new Runner("Sameer", cd);
        new Runner("Saneet", cd);
     
        long a=cd.getCount();
        while(a>=1)
        {
            System.out.println(a);
            Thread.currentThread().sleep(1000);
            cd.countDown();
            a=cd.getCount();
        }
    }
}
