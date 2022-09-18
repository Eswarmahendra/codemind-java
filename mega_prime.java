import java.util.Scanner;
class PrimesorNot
{
  public static boolean isprime(int n)
  {
     int count=0;
     if(n==1)
     return false;
	 for(int i=2;i<=(int)Math.sqrt(n);i++)
	 {
	    if(n%i==0)
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
	 int n,rem=0,count=0,len;
	 n=sc.nextInt();
	 len=(int)Math.log10(n)+1;
	 if(isprime(n))
	 {
	     while(n>0)
	     {
	         rem=n%10;
	         if(isprime(rem))
	         {
    	         count++;
	         }
	         n=n/10;
	         
	     }
	     if(count==len)
	     System.out.println("Mega Prime");
	     else
	     System.out.println("Not Mega Prime");
	     
	 }
	 else
	 System.out.println("Not Mega Prime");
	 sc.close();
		    
  }
}