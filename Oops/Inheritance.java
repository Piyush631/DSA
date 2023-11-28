package Oops;

public class Inheritance {
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.eat();
    }
    
}
class Animal{
    String name;
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathing");
    }
}
class Fish extends Animal 
{
    void fing()
    {
        System.out.println("fings");
    }

}
