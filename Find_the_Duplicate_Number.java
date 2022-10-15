import java.util.Scanner;
class Dup
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(x[i]==x[j] && i!=j)
                {
                    System.out.println(x[i]);
                    System.exit(0);
                }
            }
        }
    }
}