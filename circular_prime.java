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
	 int n,rem=0,rev=0;
	 n=sc.nextInt();
	 if(isprime(n))
	 {
	     while(n>0)
	     {  
	       rem=n%10;
	       rev=rev*10+rem;
	       n=n/10;
	     }
	     if(isprime(rev))
	     {
	         System.out.println("circular prime");
	     }
	     else
	     System.out.println("prime but not a circular prime");
	 }
	 else
	 System.out.println("not prime");
	  
  }	 
	 
}