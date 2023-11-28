package Oops;

public class MultipleInheritance {
    public static void main(String[] args) {
        Beer b1=new Beer();
        b1.eat();
        b1.eating();
        
    }
}
interface Harmibor{
    void eat();
   
}
interface Omnibor{
    void eating();
}
class Deer implements Harmibor{
    public void eat()
    {
        System.out.println("eating grass");
    }
}
class Beer implements Harmibor,Omnibor{
    public void eat()
    {
        System.out.println("eating grass");
    }
    public void eating()
    {
        System.out.println("eat nonveg");
    }
}