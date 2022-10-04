import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n1,n2,i,count=0;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=n1;i<=n2;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==2)
            
            System.out.println(i);
        }
    }
}