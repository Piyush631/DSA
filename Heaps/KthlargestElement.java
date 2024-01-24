package Heaps;
import java.util.*;
public class KthlargestElement {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,7};
        int k=2;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int res[]=new int[arr.length];
  
        for(int i=0;i<arr.length;i++)
        {
            if(pq.size() < k)
            {
                pq.add(arr[i]);
            }
            else{
                if(arr[i] > pq.peek())
                {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
            if(pq.size()<k)
            {
                res[i]=-1;
            }
            else{
                res[i]=pq.peek();
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
       
    }
    
}
