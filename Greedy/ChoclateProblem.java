package Greedy;
import java.util.*;


public class ChoclateProblem {
    public static void main(String[] args) {
        Integer vertCut[]={2,1,3,1,4};
        Integer horzCut[]={4,1,2};
        Arrays.sort(vertCut,Collections.reverseOrder());
        Arrays.sort(horzCut,Collections.reverseOrder());
        int h=0;
        int v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<horzCut.length && v<vertCut.length)
        {
            if(vertCut[v] <= horzCut[h])
            {
                cost+=(horzCut[h]*vp);
                hp++;
                h++;
            }
            else{
                 cost+=(vertCut[v]*hp);
                vp++;
                v++;
            }

        }
        while(h<horzCut.length)
        {
            cost+=(horzCut[h]*vp);
                hp++;
                h++;
        }
        while(v<vertCut.length)
        {  cost+=(vertCut[v]*hp);
                vp++;
                v++;

        }
        System.out.println(cost);
    }
    
}
