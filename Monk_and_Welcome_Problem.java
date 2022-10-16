import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int a,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for( i=0;i<a;i++)
        b[i]=sc.nextInt();
        int c[]=new int[a];
        for( i=0;i<a;i++)
        c[i]=sc.nextInt();
        int d[]=new int[a];
        for(i=0;i<a;i++)
        {
            d[i]=b[i]+c[i];
        }
        for(i=0;i<a;i++)
        System.out.print(d[i]+" ");
        
    }
}