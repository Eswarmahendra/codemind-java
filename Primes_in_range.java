import java.util.Scanner;
class primenumbers_with_range
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
        int i,a,b,c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1)
        a=2;
        for(i=a;i<=b;i++)
        {
            if(isprime(i))
           c++;

        }
       System.out.println(c); 
    }
}