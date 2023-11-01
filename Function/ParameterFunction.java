
package Function;
import java.util.*;

public class ParameterFunction {
    public static void calculate(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("sum of no. is"+ sum);
        
    }
    //second function but same working 
    public static int addition(int num3, int num4)
    {
        int sum=num3 + num4;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculate(a,b);

        // second approach
        int c=sc.nextInt();
        int d=sc.nextInt();
        int add=addition(c,d);
        System.out.println("sum is"+ add);

        
    }
    
}
