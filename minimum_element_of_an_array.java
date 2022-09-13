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
int min=9;
for(int i=0;i<a;i++)
{
if(b[i]<min)
{
min=b[i];
}
}
System.out.println(min);
}
}