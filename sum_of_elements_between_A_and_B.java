import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        int n,found=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
               sum=sum+x[i];
            }
        }
       
        System.out.println(sum);
    }
}