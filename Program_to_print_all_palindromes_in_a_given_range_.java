import java.util.Scanner;
class thub4
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
public static void main(String args[])
{
int n,b;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
b=sc.nextInt();
for(int i=n;i<=b;i++)
{
if(ispal(i))
{
System.out.print(i+" ");
}
}
}
}