package Oops;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog Doogy=new Dog();
        Doogy.legs=4;
        Doogy.eat();
        System.out.println(Doogy.legs);
        
    }
    
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
}
class Mamal extends Animal{
    int legs;
}
class Dog extends Mamal{
    String breed;
}
