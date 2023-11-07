public class Pairs {
    public static void pair(int number[])
    {
        int tmp=0;
        for(int i=0;i<number.length;i++)
        {
            int curr=number[i];
            for(int j=i+1;j<number.length;j++)
            {
                System.out.print("("+curr +","+number[j]+")" );
                tmp++;
            }
            System.out.println();
        }
        System.out.println("total pair "+tmp);
       
    }
    public static void main (String args[])
{
    int number[]={2,4,5,7,8};
    pair(number);
}
    
}
