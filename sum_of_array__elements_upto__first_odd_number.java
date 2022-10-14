import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        int n,found=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a,sum=0;
        for(int i=0;i<n;i++)
        {
            
            if(x[i]%2!=0)
            break;
            else
            sum=sum+x[i];
        }
       System.out.println(sum);
        
    }
}