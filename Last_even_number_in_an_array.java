import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        int k=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]%2==0)
            {
                System.out.println(x[i]);
                break;
            }
        }
    }
}