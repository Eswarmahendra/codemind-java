import java.util.Scanner;
class prime_r_not
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            count++;
        }
        if(count==0)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
	if(isprime(n))
		System.out.println("prime");
	else 
	System.out.println("not a prime");
    }
}