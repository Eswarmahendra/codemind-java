import java.util.Scanner;
class PrimesorNot
{
  public static boolean isprime(int x)
  {
     int count=0;
	 for(int i=2;i<=(int)Math.sqrt(x);i++)
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
     Scanner sc=new Scanner(System.in);
	 int n,k,c=0,sum=0;
	 float avg=0;
	 n=sc.nextInt();
	
	 int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    x[i]=sc.nextInt();
	}
	 k=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	    if(isprime(x[i]))
	    {
	       if(x[i]>=k)
	       c++;
	    }
	}
	
	System.out.println(c);	    
  }
}