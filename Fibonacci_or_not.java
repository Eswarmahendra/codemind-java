import java.util.Scanner;
class GCD
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c,found=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        while(c>0)
        {
            a=b;
            b=c;
            c=a+b;
            if(c==n)
            {
                System.out.println("True");
                found=1;
                System.exit(0);
            }
        }
        if(found==0)
        System.out.println("False");
       
    }
}