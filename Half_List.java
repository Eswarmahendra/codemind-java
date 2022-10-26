import java.util.Scanner;
class Half
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=n-1;i>=n/2;i--)
        System.out.print(x[i] +" ");
        for(int i=0;i<n/2;i++)
        System.out.print(x[i] +" ");
    }
}