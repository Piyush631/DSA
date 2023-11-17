package TwoDArrays;

public class Numberr {
    public static void search(int array[][],int key)
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++ )
            {
                if(array[i][j]==key)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[][] array = { {4,7,8},{8,8,7} };
        int key=7;
        search(array,key);
        
        
    }
    
}
