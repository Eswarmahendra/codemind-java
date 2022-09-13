import java.util.Scanner;
class phval
{
public static void main(String args[])
{
Long n;
Scanner sc=new Scanner(System.in);
n=sc.nextLong();
int b=(int)Math.log10(n)+1;
if(b==10)
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
}
}