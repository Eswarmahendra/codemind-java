import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
               return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int flag=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(isPrime(i) && isPrime(n/i))
                  {
                      System.out.println(i+" "+n/i);
                      flag=1;
                      break;
                  }
            }
        }
        if(flag==0)
         System.out.println("-1");
    }
}