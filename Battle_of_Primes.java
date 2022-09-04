import java.util.Scanner;
class prime
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            count++;
        }
        if (count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n1,n2,sum,c=0;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=n1+n2;
        for(int i=sum+1;;i++)
        {
            c++;
            if(isprime(i))
            break;
            
        }
        System.out.println(c);
    }
}