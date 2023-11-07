public class TrappedWater2 {
    public static int trapped(int height[])
    {
        int n=height.length;
        int res=0;
        int l = 0;
        int r=n-1;  
        int lmax= height[l];
         int rmax=height[r];   
         while(l<r)
         {
            if(lmax<rmax)
            {
                l++;
                lmax=Math.max(lmax,height[l]);
                res+=lmax-height[l];
            }
            else{
                r--;
                rmax=Math.max(rmax,height[l]);
                res+=rmax-height[l];
            }
         } 
         return res; 
       }
       public static void main (String args[])
       {
        int height[]={4,2,0,3,2,5};
        System.out.println("traped water is "+ trapped(height));
       }
    
}
