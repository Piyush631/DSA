package ArrayList;

public class Practice {
    
    
    public static void main(String[] args) {
      int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
      int n[][]=new int[matrix.length][matrix[0].length];
        int rowend=matrix.length-1;
        int colend=matrix[0].length;
        int start=0;
        int colstart=0;
         for(int j=colstart; j<colend;j++)
  
      {
           for(int i=rowend;i >=start;i--)
        {
            n[i][j]=matrix[i][j];
        }
       
      }
      for(int i=0; i<rowend;i++)
  
      {
           for(int j=0;j<colend;j++)
        {
            matrix[i][j]=n[i][j];
            System.out.println(matrix[i][j]);
        }
    }
           
}
}
    

