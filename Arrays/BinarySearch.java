public class BinarySearch {
    public static int binarysearch(int number[],int key)

    {
        int start=0;
        int end=number.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(number[mid]==key)
            {
                return mid;

            }
            if(number[mid]< key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;


    }
    public static void main(String args[])
    {
        int number[]={2,5,7,9,12,16,18};
        int key=16;
        System.out.println("found at "+binarysearch(number,key));
    }

}
