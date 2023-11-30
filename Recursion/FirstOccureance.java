package Recursion;

public class FirstOccureance {
    public static int occureance(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return occureance(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8,9,6,9,4};
    System.out.println(occureance(arr,21,0));
        
    }
    
}
