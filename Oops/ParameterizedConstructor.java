package Oops;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1=new Student("piyush");
        Student s2=new Student(121);
        System.out.println(s1.name);
        
    }
    
}
class Student{
    String name;
    int roll;
    Student(String name)
    {
        this.name=name;
    }
    Student (int roll)
    {
        this.roll=roll;
    }
}
