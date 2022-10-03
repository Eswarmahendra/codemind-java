import java.util.Scanner;
class GCD
{
    public static void main(String args[])
    {
        int n1,n2,min=9;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1<min)
        min=n1;
        else
        min=n2;
        
        for(int i=min;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
            System.out.println(i);
            System.exit(0);
            }
            
        }
    }
}