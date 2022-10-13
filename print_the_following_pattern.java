import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++)
        {
            if(i > 1 && i < N)
            {
                int p = i-2;
                int q = N-i;
                System.out.print("*");
                for(int j=1; j<=p;j++)
                    System.out.print(" ");
                System.out.print("*");
                for(int k=1; k<=q; k++)
                    System.out.print(" ");
            }
            else if(i == N)
            {
                int j=i;
                while(j > 0)
                {
                    System.out.print("*");
                    j--;
                }
            }
            else if(i == 1)
            {
                int q = N-i;
                System.out.print("*");
                while(q > 0)
                {
                    System.out.print(" ");
                    q--;
                }
            }
            if(i != N)
            {
                System.out.print("
");
            }
        }
        sc.close();
    }
}