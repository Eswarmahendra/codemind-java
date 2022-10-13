import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
            for(int p=1; p<N;p++)
                System.out.print(" ");
        if(N > 0)
            System.out.println(0);
        for(int i=1; i<N; i++)
        {
            for(int p=1; p<N-i;p++)
                System.out.print(" ");
            for(int j=i; j>0; j--)
                System.out.print(j);
            System.out.print(0);
            for(int j=1; j<=i;j++)
                System.out.print(j);
            System.out.print("
");
        }
        sc.close();
    }
}