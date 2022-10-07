import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(x[j]%2==0)
            count++;
        }
        if(count==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}