import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        int m,count=0,n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           
            if(x[i]%k==0)
            count++;
        }
        System.out.println(count);
    }
}