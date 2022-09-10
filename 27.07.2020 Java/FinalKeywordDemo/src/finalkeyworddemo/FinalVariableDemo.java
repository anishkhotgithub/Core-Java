package finalkeyworddemo;

public class FinalVariableDemo 
{
    //CONSTANT VARIABLE
    //static final float PI=3.14f;
    
    final float pi=3.14f;
    
    public void display()
    {
        pi=5.15f;
        System.out.println(pi);
    }
    
    public static void main(String[] args) 
    {
        FinalVariableDemo fvd=new FinalVariableDemo();
        fvd.display();
    }
}
