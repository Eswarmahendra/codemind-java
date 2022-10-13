import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j == i)
                    System.out.print("0");
                else
                    System.out.print("x");
            }
            p++;
            //if(i != N)
                System.out.print("
");
        }
        sc.close();
    }
}