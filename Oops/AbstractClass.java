package Oops;

public class AbstractClass {
    public static void main(String[] args) {
        Chicken c1=new Chicken();
        c1.walk();
        c1.eat();
        
    }
    
}
 abstract class Animal{
    Animal()
    {
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal is eating");
    }
    abstract void walk();
 

}
 class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk()
    {
        System.out.println("walk on 4 legs");
    }
 }
 class Chicken extends Animal{
    Chicken()
    {
        System.out.println("chicken constructor called");
    }
    void walk()
    {
        System.out.println("walk on 2 legs");
    }
 }