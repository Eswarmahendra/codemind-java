import java.util.Scanner;
class Pal
{
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        int rev=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(m==rev)
        System.out.println("True");
        else
        System.out.println("False");
    }
}