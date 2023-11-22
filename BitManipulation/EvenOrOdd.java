package BitManipulation;

public class EvenOrOdd {
    public static void check(int a)
    {
        int bitmask=1;
         if((a & bitmask)==0)
        {
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }

    }
    public static void main(String[] args) {
        int a=4;
        check(a);
    }
    
}
