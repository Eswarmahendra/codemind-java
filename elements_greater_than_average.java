import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,sum=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        float avg;
        for(int i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=(int)sum/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]>=avg)
            count++;
        }
        System.out.println(count);
    }
}