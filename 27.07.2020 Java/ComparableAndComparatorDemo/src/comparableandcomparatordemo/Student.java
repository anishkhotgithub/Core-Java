package comparableandcomparatordemo;

public class Student implements Comparable<Student>
{
    int roll_number;
    String name;
    int age;

    public Student() {
    }

    public Student(int roll_number, String name, int age) {
        this.roll_number = roll_number;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s2)
    {
        if(this.age>s2.age)
        {
            return 1;
        }
        else if(this.age<s2.age)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    
}
