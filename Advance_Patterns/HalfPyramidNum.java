package Advance_Patterns;

public class HalfPyramidNum {
    public static void numPyramid(int n)
    {
        //outer
        for(int i = 1; i <= n; i++)
        {
                //numbers
            for(int j = 1; j<= n-i+1;j++)
            {
                System.out.print(j+" ");
            }
          
            System.out.println();

        }
    }
    public static void main(String[] args) {
        numPyramid(5);
        
    }
    
}
