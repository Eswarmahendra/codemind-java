import java.util.Scanner;
class thub
{
public static void main(String args[])
{
int sum=0,count=0,i,b=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for ( i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for ( i=0;i<n;i++)
{
if (a[i]%2==0)
{
b=a[i];
}
}
System.out.println(b);
}
}
