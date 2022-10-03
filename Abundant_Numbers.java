import java.util.Scanner;
class ab
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
            
        }
        if(sum>n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}