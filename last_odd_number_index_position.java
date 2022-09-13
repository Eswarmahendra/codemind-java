import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int n,i,b=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                b=i;
            }
        }
        System.out.println(b);
    }
}