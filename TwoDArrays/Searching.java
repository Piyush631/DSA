package TwoDArrays;
import java.util.*;

import java.util.Scanner;

public class Searching {
    public static boolean search(int matrix[] [],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.print("found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix [] []=new int[3][3];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
          for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.println();
        }
        int key=4;
        search(matrix,key);
        
        
    }
    
}

    

