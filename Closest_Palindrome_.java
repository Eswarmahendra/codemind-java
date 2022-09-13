import java.util.Scanner;
class nearpali
{
public static boolean isPalindrome(int n)
{
int rem=0,rev=0,temp=0;
temp=n;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(rev==temp)
return true;
else
return false;
}
public static void main(String args[])
{
int a,c,d,d1=0,d2=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(int i=a-1;;i--)
{
if(isPalindrome(i))
{
d1=i;
break;
}
}
for(int i=a+1;;i++)
{
if(isPalindrome(i))
{
d2=i;
break;
}
}
c=a-d1;
d=d2-a;
if(c==d)
System.out.println(d1+" "+d2);
else if(c<=d)
System.out.println(d1);
else
System.out.println(d2);
}
}