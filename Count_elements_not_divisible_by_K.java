import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        int m,count=0,n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            m=sc.nextInt();
            if(m%k!=0)
            count++;
        }
        System.out.println(count);
    }
}