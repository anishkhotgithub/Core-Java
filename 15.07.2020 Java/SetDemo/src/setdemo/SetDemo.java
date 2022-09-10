
package setdemo;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo 
{
    public static void main(String[] args) 
    {
        //Set will not allow duplicate values
        //Bydefault it sorts data in ascending order
        //Set is unordered means we don't have index position.
        
        Set<String> mySet=new TreeSet();
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("three");
        mySet.add("four");
        
        mySet.remove("two");

        for (String s : mySet) 
        {
            System.out.println(s);
        }
        
    }
}
