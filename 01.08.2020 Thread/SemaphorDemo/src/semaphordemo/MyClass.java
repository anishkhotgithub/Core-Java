
package semaphordemo;

import java.util.concurrent.Semaphore;

public class MyClass extends Thread
{
    Semaphore sem;  
    
    public MyClass(Semaphore sem, String threadName)  
    { 
        setName(threadName);
        this.sem = sem; 
    } 
  
    @Override
    public void run() { 
          
        if(getName().equals("A")) 
        { 
            System.out.println("Starting " + getName()); 
            try 
            { 
                System.out.println(getName() + " is waiting for a permit."); 
                sem.acquire(); 
              
                System.out.println(getName() + " gets a permit."); 
                
                for(int i=0; i < 5; i++) 
                { 
                    Shared.count++; 
                    System.out.println(getName() + ": " + Shared.count); 
          
                    Thread.sleep(10); 
                } 
            }
            catch (InterruptedException exc) 
            { 
                    System.out.println(exc); 
            } 
                System.out.println(getName() + " releases the permit."); 
                sem.release(); 
        } 
          
        else
        { 
            System.out.println("Starting " + getName()); 
            try 
            { 
                System.out.println(getName() + " is waiting for a permit."); 
                sem.acquire(); 
                System.out.println(getName() + " gets a permit."); 
                for(int i=0; i < 5; i++) 
                { 
                    Shared.count--; 
                    System.out.println(getName() + ": " + Shared.count); 
                    Thread.sleep(10); 
                } 
            } 
            catch (InterruptedException exc)
            { 
                    System.out.println(exc); 
            } 
            
            System.out.println(getName() + " releases the permit."); 
            sem.release(); 
        } 
    } 
}
