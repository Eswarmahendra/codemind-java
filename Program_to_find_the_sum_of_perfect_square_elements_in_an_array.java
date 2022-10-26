import java.util.Scanner;
class Code
{
    public static boolean isPer(int n)
    {
        int c=(int)Math.sqrt(n);
        if((int)Math.pow(c,2)==n)
        {
            return true;
        }
        else
        return false;
    }
   
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(isPer(x[i]))
            {
                sum=sum+x[i];
            }
        }
        System.out.println(sum);
    }
}