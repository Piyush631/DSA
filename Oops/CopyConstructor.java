package Oops;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="piyush";
        s1.roll=12;
        s1.marks[0]=70;
        s1.marks[1]=90;
        s1.marks[2]=50;
     s1.name="paras";
        Student s2=new Student(s1);
        s2.roll=92;//copy constructor
        s1.marks[1]=100;
   
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
    }
    
}
class Student{
    String name;
    int roll;
    int marks[];
    
    Student(Student s1) //copy constructor
    {
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    Student(String name)
    {
        this.name=name;
    }
    Student(int roll)
    {
        this.roll=roll;
    }
 Student() {
    marks=new int[3];
    }
}
