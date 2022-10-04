import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            System.out.print(x[i] +" ");
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            System.out.print(x[i] +" ");
        }
    }

    
}