public class TrappedWaterPractice {
    public static int trapped(int number[])
    {
        int n=number.length;
        int leftmax[]=new int[n];
        leftmax[0]=number[0];
        for(int i = 1; i <n;i++ )
        {
            leftmax[i]=Math.max(number[i],leftmax[i-1]);
        }
        int rightmax[]= new int[n];
        rightmax[n-1]=number[n-1];
        for(int i =n-2;i >=0;i--){
            rightmax[i]=Math.max(number[i],rightmax[i+1]);

        }
        int trap=0;
        for(int i = 0;i<n;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trap=trap+waterlevel-number[i];
        }
        return trap;
    }
    public static void main(String args[])
    {
        int number[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapped(number));
    }
    
}
