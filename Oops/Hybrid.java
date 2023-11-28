package Oops;

public class Hybrid {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.walk();
        c1.color="black";
        Fish f1 =new Fish();
        f1.swim();
        System.out.println(c1.color);
        
    }
    
}
class Animal{
    String color;
    void eats()
    {
        System.out.println("eating");
    }
}
class Fish extends Animal{
    void swim()
    {
        System.out.println("swiming");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flying");

    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walking");
    }
}
class Sharks extends Fish{
    String breed;
}
class Peacock extends Bird{
    String height;
}
class Cat extends Mammal{
    int legs;
}