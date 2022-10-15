import java.util.*;
class java
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        b[i]=sc.nextInt();
        int j=0;
        for(int i=0;i<a;i++)
        {
           if(b[i]!=0)
           b[j++]=b[i];
        }
        while(j<a)
        {
            b[j++]=0;
        }
        for(int i=0;i<a;i++)
        System.out.print(b[i]+" ");
    }
}