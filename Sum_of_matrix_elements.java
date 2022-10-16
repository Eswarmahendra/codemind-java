import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c[][]=new int[a][b];
        int s=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
               c[i][j]=sc.nextInt();
               s=s+c[i][j];
            }
        }
        System.out.print(s);
    }
}