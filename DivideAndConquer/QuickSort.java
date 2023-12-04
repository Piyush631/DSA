package DivideAndConquer;

public class QuickSort {
    public static void quick(int arr[],int si,int ei)
    {
        if(si >= ei )
        {
            return;
        }
        int idx=partition(arr, si, ei);
        quick(arr, si, idx-1);
        quick(arr,idx+1,ei);

    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=0;j<ei;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public  static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,6,5};
        quick(arr, 0, arr.length-1);
        print(arr);

    }
    
}
