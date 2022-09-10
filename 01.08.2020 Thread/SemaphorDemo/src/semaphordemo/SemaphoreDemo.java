
package semaphordemo;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {   
        Semaphore sem = new Semaphore(1); 
          
        MyClass mt1 = new MyClass(sem, "A"); 
        MyClass mt2 = new MyClass(sem, "B"); 
          
        mt1.start(); 
        mt2.start(); 
          
        mt1.join(); 
        mt2.join(); 
        System.out.println("count: " + Shared.count); 
    }
}
