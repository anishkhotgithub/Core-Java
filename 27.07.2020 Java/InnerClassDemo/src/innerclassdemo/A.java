
package innerclassdemo;

public class A 
{
    public void print()
    {
        System.out.println("print method...");
    }
    
    class B
    {
        public void display()
        {
            System.out.println("display method...");
        }
    }
    
    public static void main(String[] args) 
    {
        //Outer class
        A a=new A();
        a.print();
        
        //Inner class
        B b=new A().new B();
        b.display();
    }
}
