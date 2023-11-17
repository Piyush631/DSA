package TwoDArrays;

public class Practice {
    public static void diagonal(int number[][])
    {
        int sum=0;
        for(int i=0;i<number.length;i++)
        {
            sum+=number[i][i];
            if(i !=number.length-1-i)
            sum+=number[i][number.length-i-1];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int number[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}

        };
        diagonal(number);
    }
    
}
