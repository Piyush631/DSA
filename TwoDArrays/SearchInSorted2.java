package TwoDArrays;

public class SearchInSorted2 {
    public static boolean stairssearch(int matrix[][],int key)
    {
        int rowvalue=matrix.length-1;
        int col=0;
        while(col <=matrix[0].length && rowvalue >=0  )
        {
            if(matrix[rowvalue][col]==key)
            {
                System.out.print("number found at ("+rowvalue+","+col+")");
                return true;
            }
            else if(matrix[rowvalue][col] > key)
            {
                rowvalue--;
            }
            else {
                col++;
            }
        }
        System.out.println("not found !");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={ {10,20,30,40},
        {15,25,35,45},
        {27,29,37,49},
        {30,33,39,56},

};
int key=33;
stairssearch(matrix,key);
    }
    
}
