import java.util.Scanner;
class evfood
{
public static void main(String args[])
{
int a;
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
System.out.print(b[i]+" ");
}
}
for(int j=0;j<a;j++)
{
if(b[j]%2!=0)
{
System.out.print(b[j]+" ");
}
}
}
}