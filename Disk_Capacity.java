import java.util.Scanner;
class disk
{
    public static void main(String args[])
    {
        int t,s,cap,b;
       
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        cap=2*t*s*b*512;
        System.out.println(cap);
    }
}