
package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo 
{
    public static void main(String[] args) 
    {
        List<String> myList=new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add(0,"four");
        
        myList.remove("two");
        myList.remove(0);
        
        System.out.println("Value at index 0: "+myList.get(1));
        System.out.println("");
        
        System.out.println("");
        for (String s : myList) 
        {
            System.out.println(s);
        }

        System.out.println("");
        Iterator<String> elements= myList.iterator();
        while(elements.hasNext())
        {
            System.out.println(elements.next());
        }
    }
}
