import java.util.Scanner;
class df
{
    public static void main(String args[])
    {
        int i,j,a,k=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for( i=1;i<=a;i++)
        {
            for(j=1;j<=a;j++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}