import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        int n,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}