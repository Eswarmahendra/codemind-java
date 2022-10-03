import java.util.Scanner;
class Ami
{
    public static void main(String args[])
    {
        int n1,n2,c1=0,c2=0;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=1;i<=n1/2;i++)
        {
            if(n1%i==0)
            c1=c1+i;
        }
        for(int j=1;j<=n2/2;j++)
        {
            if(n2%j==0)
            c2=c2+j;
        }
        if(c1==n2 && c2==n1)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
        
    }
}