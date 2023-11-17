package TwoDArrays;

public class Sum {
    public static void sum(int number[][])
    {
        int sum=0;
        for(int i=1;i<number.length-1;i++)
        {
            for(int j=0;j<number[0].length;j++)
            {
                sum+=number[i][j];
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
       int[][] number = { {1,4,9},{11,4,3},{2,2,3} };
       sum(number);
    }
    
}
