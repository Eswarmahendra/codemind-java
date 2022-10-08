import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int n,sum=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]!=-999)
            {
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        x[j]=-999;
                    }
                }
                sum=sum+x[i];
            }
        }
        System.out.println(sum);
    }
}