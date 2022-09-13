import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,b=0;
       n=sc.nextInt();
       if(n>2)
       {
       b=n*(n-3)/2;
       System.out.println(b);
       }
    }
}