package Oops;

public class Static {
    public static void main(String[] args) {
        School s1=new School();
        s1.schoolName="gav";
        s1.name="piyush";
        School s2=new School();
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s2.schoolName); // beacause static is declared
        
    }
    
}
class School{
    String name;
    int rollno;
     static String schoolName;  //using static
    
    void setName(String name)
    {
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setRoll(int rollno)
    {
        this.rollno=rollno;
    }
     int getRoll()
    {
        return this.rollno;
    }
}
