package Oops;

public class Super {
    public static void main(String[] args) {
        Beer b1=new Beer();
        System.out.println(b1.color);
    
        
        
    }
}
class Animal{
     String color;
    Animal()
    
    {
       
        System.out.println("animal constructor is called");
    }
}
class Beer extends Animal{
    Beer()

    {
        super.color="brown";
        System.out.println("beer constructor is called");
    }
}
