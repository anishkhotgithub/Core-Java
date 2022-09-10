
package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo
{
            
    private final ReentrantLock lock = new ReentrantLock();
    private static int count = 0;

     //Locking using Lock and ReentrantLock
     public int getCount() 
     {
        lock.lock();
        
        try 
        {
            System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
            return count++;
        } 
        finally 
        {
            lock.unlock();
        }
     }

     //Implicit locking using synchronized keyword
     public synchronized int getCountTwo()
     {
            return count++;
     }

    

    public static void main(String args[]) 
    {
        final ReentrantLockDemo counter = new ReentrantLockDemo();
        Thread t1 = new Thread() {

            @Override
            public void run() {
                while (counter.getCountTwo() < 6) 
                {
                    try {
                        System.out.println(Thread.currentThread().getName()+" "+count);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();                    }
                }
            }
        };
      
        Thread t2 = new Thread() {

            @Override
            public void run() 
            {
                while (counter.getCountTwo() < 6) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" "+count);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
      
        t1.start();
        t2.start();
    }
}

