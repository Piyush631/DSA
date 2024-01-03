package Greedy;
import java.util.*;
public class ActivityProblem{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //sorting
        int activity[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        //perform lamda for sortinf
        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(activity[0][0]);
        maxAct=1;
        int lastEnd=activity[0][2];
        for(int i=1;i<start.length;i++)
        {
            if((activity[i][1]) >=lastEnd)
            {
                ans.add(activity[i][0]);
                maxAct++;
                lastEnd=activity[i][2];
            }
        }
        System.out.println("Maximum activity perform is: "+maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
    }

}