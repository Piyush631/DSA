package Arrays;

public class PairsInArray {
    public static void pair(int number[])
    {
        int tp=0;
        for(int i = 0;i<number.length;i++)
        {
            for(int  j=i+1;j<number.length;j++)
            {
                System.out.print("("+number[i]+","+number[j]+")");
                  tp++;
            }
            
            System.out.println();
          
        }
        
            System.out.println("total pair "+tp);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,9};
        pair(number);
    
        
    }
    
}
