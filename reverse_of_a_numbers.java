import java.util.Scanner;
class rev
{
    public static void main(String args[])
    {
        int n,rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}