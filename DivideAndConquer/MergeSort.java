package DivideAndConquer;

public class MergeSort {
    public  static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int arr[],int si,int ei)
    {
        if(si >= ei)
        {
 return;
        }
       
        int mid=(si+(ei-si))/2;
        merge(arr, si, mid); //left 
        merge(arr, mid+1, ei);   //right

        sort(arr,si,mid,ei);
    }
    public static void sort(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while( i <=mid && j <= ei)
        {
            if(arr[i] <  arr[j])
            {
                temp[k]=arr[i];
                i++;

            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while( i <=mid)
        {
            temp[k++]=arr[i++];
           
        }
           while( j <=ei)
        {
            temp[k++]=arr[j++];
           
        }
        for(k=0, i=si; k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
   
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,1,4,3};
        merge(arr, 0, arr.length-1);
        printarr(arr);
    }
}
