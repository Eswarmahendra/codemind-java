import java.util.*;
class strpal
{
public static boolean isPal(String s)
{
int n=s.length();
for(int i=0;i<n/2;i++)
{
if(s.charAt(i)!=s.charAt(n-i-1))
{
return false;
}
}
return true;
}
public static void main(String args[])
{
String s1;
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
while(t>0)
{
s1=sc.nextLine();
int l=s1.length();
if(isPal(s1) && l%2==0)
{
System.out.println("YES EVEN");
}
else if(isPal(s1) && l%2!=0)
{
    System.out.println("YES ODD");
}
else
System.out.println("NO");
t--;
}
}
}
