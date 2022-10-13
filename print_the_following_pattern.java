import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++)
        {
                for(int k=1; k<=N-i; k++)
                    System.out.print(" ");
            for(int j=1; j<2*i; j++)
            {
                System.out.print(i);
            }
            System.out.print("
");
        }
        sc.close();
    }
}