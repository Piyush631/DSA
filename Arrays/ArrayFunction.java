package Arrays;

public class ArrayFunction {
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;

        }
    }
    public static void main(String[] args) {
        int marks[]={98,99,100};
        update(marks); //ARRAY USED CALL BY REFERENCE
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        

        
    }
    
}
