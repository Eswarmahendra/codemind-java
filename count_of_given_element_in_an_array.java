import java.util.Scanner;
class evfood
{
public static void main(String args[])
{
int a,c,count=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
 c=sc.nextInt();
for(int i=0;i<a;i++)
{
if(b[i]==c)
{
count++;
}
}
System.out.println(count);
}
}
