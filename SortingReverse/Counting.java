package SortingReverse;

public class Counting {
    public static void sort(int number[])
    {
        int count[]=new int[number.length];
        for(int i=0;i<number.length;i++)
        {
            count[number[i]]++;
        }
    int j=0;
    for(int i=0;i<count.length;i++)
    {
        while(count[i]>0)
        {
            number[j]=i;
            j++;
            count[i]--;
        }
    }
    for(int i=0;i<number.length;i++)
    {
        System.out.print(number[i]+" ");
    }
    }
    public static void main(String[] args) {
        int number[]={1,2,5,2,3,4,5,6,1};
        sort(number);
    }
    
}
