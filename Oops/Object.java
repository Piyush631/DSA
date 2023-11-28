package Oops;

public class Object {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);
            Mobile m1=new Mobile();
    m1.setColor("red");
    System.out.println(m1.get());
    }

    
}
class Pen
{
     String color;
    int tip;
    void setColor(String newColor)
    {
        color=newColor;
    }
    void setTip(int newTip)
    {
        tip=newTip;
    }
}
class Mobile
{
      private String color;
   private int tip;
   String get(){
    return this.color;
   }
    void setColor(String newColor)
    {
        color=newColor;
    }
    void setTip(int newTip)
    {
        tip=newTip;
    }
}

