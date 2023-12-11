package Backtracking;

public class Sudoko {
    public static boolean isSafe(int grid[][],int row,int col,int digit)
    {
        for(int i=0;i<=8;i++)
        {
            if(grid[i][col]==digit){
                return false;
            }
           
        }
        for(int i=0;i<=8;i++)
        {
            if(grid[row][i]==digit){
                return false;
            }
           
        }
        //for grid;
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr; i<sr+3;i++)
        {
            for(int j= sc; j<sc+3;j++)
            {
                if(grid[i][j]==digit)
                {
                    return false;
                }
                
            }
        }
        return true;
    }
    
    public static boolean sudokoSolve(int grid[][],int row,int col)
    {
        if(row==9 && col==0)
        {
            return true;
        }
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;
        }
        if(grid[row][col] != 0)
        {
            return sudokoSolve(grid, nextrow, nextcol);
        }

        for(int digit=1;digit<=9;digit++)
        {
            if(isSafe(grid,row,col,digit))
            {
                grid[row][col]=digit;
                if(sudokoSolve(grid, nextrow, nextcol)){
                    return true;

                }
                grid [row][col]=0;
            }
            
            
        }
        return false;
    }
    public static void print(int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print( grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        if(sudokoSolve(grid, 0, 0)){
            print(grid);
        }
        else{
            System.out.println("Solution not found");
        }

    }
    
}
