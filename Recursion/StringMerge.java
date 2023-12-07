package DivideAndConquer;

public class StringMerge {
    public static void search(String [] str,int si,int ei)
{
    if(si >= ei)
    {
        return;
    }
        int mid=si+(ei-si)/2;
        search(str, si, mid);
        search(str, mid+1, ei);
        sort(str,si,mid,ei);
}
public static void sort(String [] str,int si,int mid,int ei)
{
    String temp[]=new String[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    
    while(i <= mid && j<=ei)
    {
       
     
        {
            if(str[i].compareTo(str[j])<0)
            {
                temp[k]=str[i];
                i++;
            }
            else{
                temp[k]=str[j];
                j++;
            }
            k++;

        }
    }
    while(i <= mid)
{
    temp[k++]=str[i++];
}
while(j <= ei)
{
    temp[k++]=str[j++];
}
for(k=0,i=si;k<temp.length;k++,i++)
{
    str[i]=temp[k];
}
}
public static void print(String []str)
{
    for(int i=0;i<str.length;i++)
    {
        System.out.print(str[i]);
    }
}
    public static void main(String[] args) {
        String str[]={"piyush","apple","lichi","mango","orange"};
        search(str,0,str.length-1);
        print(str);
    }
    
}
