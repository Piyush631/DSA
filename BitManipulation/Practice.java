package BitManipulation;

public class Practice {
    public static void check(int a,int b)
    {
        a=a>>b;
        
    }
    
    public static void main(String[] args) {
      int a=4;
      int b=7;
      check(a,b);
      int x=6;
      System.out.println(x+" + "+1+" is "+-~x);
    }
}

    
