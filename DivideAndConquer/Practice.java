package DivideAndConquer;

public class Practice {
    public static void quick(int arr[],int si,int ei)
    {
        if(si >= ei)
        {
            return;
        }
       int idx=part(arr, si, ei);
        quick(arr, si, idx-1);
        quick(arr, idx+1, ei);
    }
    public static int part(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int j=si-1;
    for(int i=si;i < ei;i++)
    {
        if(arr[i] <= pivot)
        {
            j++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    j++;
    int temp=pivot;
    arr[ei]=arr[j];
    arr[j]=temp;
    return j;
    }
   
    public static void printar(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    
    public static void main(String[] args) {
        int arr[]={4,2,8,5,6,1};
        quick(arr, 0, arr.length-1);
        printar(arr);
        
    }
    
}
