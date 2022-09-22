import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        int k=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
                k=i;
            }
        }
        System.out.println(k);
    }
}