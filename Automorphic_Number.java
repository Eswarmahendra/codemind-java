import java.util.Scanner;
class aujto
{
    public static void main(String args[])
    {
        int n,res=0,sq;
        int len;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        len=(int)Math.log10(n)+1;
        res=sq%(int)Math.pow(10,len);
        if(res==n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
        
    }
}