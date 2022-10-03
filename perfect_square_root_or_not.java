import java.util.Scanner;
class Per
{
    public static void main(String args[])
    {
        int n,res=0,sq=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        res=(int)Math.sqrt(n);
        sq=res*res;
        if(sq==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}