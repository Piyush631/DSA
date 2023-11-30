package Recursion;

public class LastOccureance {
    public static int last(int arr[],int key,int i)
    {   
        if(i==arr.length)
        {
            return -1;
        }
        int isFound=last(arr,key,i+1);
        if(isFound==-1 && arr[i]==key)
        {
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,4,8,2};
        System.out.println(last(arr,4,0));
    }
    
}
