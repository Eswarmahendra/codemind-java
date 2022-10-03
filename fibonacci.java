import java.util.Scanner;
class GCD
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c=0,count=2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        System.out.print(a +" " +b);
        while(c>0)
        {
            System.out.print(" " +c);
            count++;
            if(count==n)
            break;
            a=b;
            b=c;
            c=a+b;
        }
       
       
    }
}