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
        int a,sum1=0,sum2=0,diff=0;
        for(int i=0;i<n/2;i++)
        {
            sum1=sum1+x[i];
        }
        for(int i=n/2;i<n;i++)
        {
            sum2=sum2+x[i];
        }
        diff=Math.abs(sum1-sum2);
       System.out.println(diff);
        
    }
}