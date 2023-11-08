package Arrays;

public class NumberTwice {
    public static boolean check(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                if(number[i]==number[j])
                {
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int number[]={1,2,1,2,3,3,1};
        int number2[]={1,2,3,4};
        System.out.println(check(number));
        System.out.println(check(number2));
        
    }
    
}
