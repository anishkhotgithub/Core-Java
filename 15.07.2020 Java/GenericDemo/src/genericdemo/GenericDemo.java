
package genericdemo;

public class GenericDemo 
{
    public <T> void displayArray(T a[])
    {
        for (T i : a) 
        {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) 
    {
        Integer arr1[]={2,3};
        Integer arr2[]={5,6};
        Float arr3[]={2.3f,5.6f};
        String arr4[]={"Hello","World"};
        
        GenericDemo gd=new GenericDemo();
        gd.displayArray(arr1);
        gd.displayArray(arr2);
        gd.displayArray(arr3);
        gd.displayArray(arr4);
    }
}
