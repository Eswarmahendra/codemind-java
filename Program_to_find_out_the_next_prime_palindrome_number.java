import java.util.Scanner;
class codemind
{
public static boolean ispal(int a)
{
int rem=0,rev=0,tem=0;
tem=a;
for(int i=a;;i++)
{
while(i>0)
{
rem=i%10;
rev=rev*10+rem;
i=i/10;
}
if(tem==rev)
return true;
else
return false;
}
}
public static boolean isPrime(int a)
{
int count=0;
for(int i=2;i<=Math.sqrt(a);i++)
{
if(a%i==0)
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
for(int i=n+1;;i++)
{
if(ispal(i) && isPrime(i))
{
System.out.println(i);
break;
}
}
}
}
