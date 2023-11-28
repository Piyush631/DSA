package Oops;

public class Interface {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.move();
        
    }
    
}
interface ChessPlayer{
  void move();
    
}
class Queen implements ChessPlayer{
   public void move()
    {
        System.out.println("move in all direction");
    }
}
class Elephant implements ChessPlayer{
   public void move()
    {
        System.out.println("move in straight direction");
    }
}
class Horse implements ChessPlayer{
   public void move()
    {
        System.out.println("move in Like a L in  four step");
    }
}