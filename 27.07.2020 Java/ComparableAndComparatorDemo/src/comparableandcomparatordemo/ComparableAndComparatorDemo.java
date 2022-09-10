package comparableandcomparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparatorDemo 
{

    public static void main(String[] args) 
    {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(123, "praneet", 25));
        students.add(new Student(124, "ajeet", 21));
        students.add(new Student(125, "saneet", 23));

        System.out.println("Sort Age wise using comparable");
        Collections.sort(students);
        for (Student student : students) 
        {
            System.out.println("Roll No: "+student.roll_number);
            System.out.println("Roll Age: "+student.age);
            System.out.println("Roll Name: "+student.name);
            System.out.println("");
        }
        
        System.out.println("Sort Name wise using comparator");
        Collections.sort(students, new ComparatorSorting());
        for (Student student : students) 
        {
            System.out.println("Roll No: "+student.roll_number);
            System.out.println("Roll Age: "+student.age);
            System.out.println("Roll Name: "+student.name);
            System.out.println("");
        }
        
       
        
        

    }
}
