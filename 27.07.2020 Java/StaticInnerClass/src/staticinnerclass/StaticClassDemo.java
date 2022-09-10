
package staticinnerclass;

public class StaticClassDemo
{
    static class B
    {
        public void display()
        {
            System.out.println("display method.....");
        }
    }
    
    public static void main(String[] args) 
    {
        B b=new StaticClassDemo.B();
        b.display();
    }
}
