package Oops;

public class HierarichalInheritance {
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.swim();
       f1.color="blue";
       System.out.println(f1.color);
        
    }
    
}
class Animal {
    String color;
    void eat()
    {
        System.out.println("eating");
    }
}
class Mammal extends Animal{
    void walk()
    {
        System.out.println("waling");
    }

}
class Fish extends Animal{
    void swim()
    {
        System.out.println("swiming");
    }
}
