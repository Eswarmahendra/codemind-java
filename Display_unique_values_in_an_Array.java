import java.util.Scanner;
class Dis
{
    public static void main(String args[])
    {
        int a,found=0,flag=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(x[i]!=-9)
            {
            int count=1;
            for(int j=0;j<a;j++)
            {
                if(x[i]==x[j] && i!=j)
                {
                    count++;
                    x[j]=-9;
                }
            }
            if(count==1)
            {
            System.out.print(x[i]+" ");
            flag++;
            }
            }
        }
if(flag==0)
System.out.println("-1");
    }
}