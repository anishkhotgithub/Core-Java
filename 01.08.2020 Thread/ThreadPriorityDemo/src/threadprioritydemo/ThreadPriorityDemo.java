
package threadprioritydemo;

public class ThreadPriorityDemo 
{
    public static void main(String[] args) 
    {
        MyClass m1=new MyClass();
        MyClass m2=new MyClass();
        
        m1.setName("m1");
        m2.setName("m2");
        
        //Max  - 10
        //Min  - 1
        //Norm - 5  (Default)
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        
        m1.start();
        m2.start();
    }
}
