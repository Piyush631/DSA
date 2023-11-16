package TwoDArrays;

public class Diagonal {
    public static int diagonal(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            //primary
            sum+=matrix[i][i];
            //secondary
            if(i !=matrix.length-i-1)
            sum+=matrix[i][matrix.length-i-1];
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={ {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16},

};
int matrix2[][]={
    {1,2,3},
    {4,5,6},
    {7,8,9}

};
System.out.println("diagonal of matrix is "+(diagonal(matrix)));
System.out.println("diagonal of matrix is "+(diagonal(matrix2)));
    }
}
