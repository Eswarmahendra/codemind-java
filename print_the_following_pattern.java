import java.util.Scanner;
class patpra
{
public static void main(String args[])
{
int a,b,i,j,k=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=a;i>=1;i--)
{
for(j=1;j<=i;j++)
{ 
System.out.print((char)(64+i)+" ");
}
System.out.println();
}
}
}
