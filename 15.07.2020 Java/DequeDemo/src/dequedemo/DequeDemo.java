
package dequedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo 
{
    public static void main(String[] args) 
    {
        //Add & Remove method for
        //FIFO
        System.out.println("");
        Deque<String> myDeque1=new ArrayDeque<>();
        myDeque1.add("one");
        myDeque1.add("two");
        myDeque1.add("three");
        
        for (String s : myDeque1) 
        {
            System.out.println(s);
        }
        
        //Push & POP method for
        //LIFO
        System.out.println("");
        Deque<String> myDeque2=new ArrayDeque<>();
        myDeque2.push("one");
        myDeque2.push("two");
        myDeque2.push("three");
        
        for (String s : myDeque2) 
        {
            System.out.println(s);
        }
    }
}
