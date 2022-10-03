import java.util.Scanner;
class Adam
{

    public static void main(String args[])
    {
        int n,rem1=0,rem2=0,rev1=0,rev2=0,sq1=0,sq2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq1=n*n;
        while(n>0)
        {
            rem1=n%10;
            rev1=rev1*10+rem1;
            n=n/10;
        }
        sq2=rev1*rev1;
        while(sq2>0)
        {
            rem2=sq2%10;
            rev2=rev2*10+rem2;
            sq2=sq2/10;
        }
        if(sq1==rev2)
        {
            System.out.println("True");
            
        }
        else
        System.out.println("False");
        
    }
}