import java.util.Scanner;
class evfood
{
public static void main(String args[])
{
int a,sum=0,c=0,co=0;
float avg=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
if(b[i]%2==0)
{
co++;
}
}
if(co==a)
System.out.print("True");
else
System.out.println("False");
}
}
