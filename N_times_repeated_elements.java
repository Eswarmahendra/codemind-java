import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int n,count=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int k;
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]!=-999)
            {
                count=1;
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        count++;
                        x[j]=-999;
                    }
                }
                if(count==k)
                {
                    System.out.print(x[i]+" ");
                    flag=1;
                }
            }
        }
        if(flag==0)
        System.out.println("-1");
    }
}