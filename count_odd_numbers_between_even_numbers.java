import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            if(x[i-1]%2==0 && x[i+1]%2==0)
            {
                if(x[i]%2!=0)
                count++;
            }
           
        }
        System.out.println(count);
    }
}