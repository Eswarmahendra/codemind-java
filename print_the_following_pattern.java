import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int i,j,a,k=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for( i=1;i<=a;i++)
        {
            for(j=a;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}