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
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
               System.out.print(x[i] +" ");
               found=1;
            }
        }
       if(found==0)
       System.out.println("-1");
        
    }
}