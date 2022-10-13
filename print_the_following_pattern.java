import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p=1;
        int q=N;
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=N; j++)
            {
                if(j == p || j == q)
                    System.out.print("x");
                else
                    System.out.print("0");
            }
            p++;
            q--;
            //if(i != N)
                System.out.print("
");
        }
        sc.close();
    }
}