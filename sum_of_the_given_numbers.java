import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n1,sum=0,n2;
            n1=sc.nextInt();
            n2=sc.nextInt();
            sum=n1+n2;
            System.out.println(sum);
        }
    }
}