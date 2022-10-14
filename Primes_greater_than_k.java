import java.util.Scanner;
class PrimesInRange
{
  public static boolean isPrime(int n)
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
	 int n,c=0,sum=0;
	 float avg;
	 n=sc.nextInt();
	 int x[]=new int[n];
	 for(int i=0;i<n;i++)
	 x[i]=sc.nextInt();
	 int k;
	 k=sc.nextInt();
	 for(int i=0;i<n;i++)
	 {
	  
	     if(isPrime(x[i]))
		 {
				if(x[i]>=k)
				c++;
		 }
	 }
	 System.out.println(c);
	 
  }
  
}