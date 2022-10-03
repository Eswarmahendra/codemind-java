import java.util.Scanner;
class dis
{
    public static void main(String args[])
    {
        int n,m,len,pow=0,rem=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        len=((int)Math.log10(n))+1;
        for(int i=len;i>=1;i--)
        {
            rem=n%10;
            pow=(int)Math.pow(rem,i);
            sum=sum+pow;
            n=n/10;
        }
        if(m==sum)
        System.out.println("True");
        else
        System.out.println("False");
    }
    
}