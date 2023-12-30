package queue;

import java.util.PriorityQueue;

public class ConnectNropes {
    public static int find(int arr[],int n)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        int res=0;
        while(pq.size()>1)
        {
            int first=pq.poll();
            int second=pq.poll();
             res+=first+second;
            pq.add(first+second);
        }
        return res;

    }
    public static void main(String[] args) {
        int n=4;
        int arr[]={4,3,2,6};
        System.out.println(find(arr,n));
    }
    
}
