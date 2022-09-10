
package strictfpdemo;

public class StrictFPDemo 
{
    //strictfp is a keyword in java used for restricting 
    //floating-point calculations and ensuring same
    //result on every platform while performing operations in the floating-point variable. 
    
    public static strictfp void main(String[] args) 
    {
        double per=1e6;
        System.out.println(per);
    }
}
