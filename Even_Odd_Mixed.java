import java.util.Scanner;
class col
{
    public static void main(String args[])
    {
        int ec=0,rem=0,oc=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int len;
        len=(int)Math.log10(n)+1;
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            ec++;
            else if(rem%2!=0)
            oc++;
            n=n/10;
        }
        if(ec==len)
        System.out.println("Even");
        else if(oc==len)
        System.out.println("Odd");
        else
        System.out.println("Mixed");
    }
}