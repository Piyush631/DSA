public class SmallestNumber {
    
        public static int smal(int number[])
        {
            int smallest=Integer.MAX_VALUE;
           
            for(int i=0;i<number.length;i++)
            {
                if(smallest > number[i])
                {
                    smallest=number[i];
                }
            }
            return smallest;
        }
        public static void main(String args[])
        {
            int number[]={3,6,4,7,9,4,5};
            int res=smal(number);
            System.out.print("smallest number is "+res);
        }
        
    }
    
    

