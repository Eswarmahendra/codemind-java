import java.util.Scanner;
class Winner
{
    public static void main(String args[])
    {
        int n,sum1=0,sum2=0,diff=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+x[i];
            }
            else
            sum2=sum2+x[i];
        }
        
       
        if(Math.abs(sum1-sum2)%4==0)
        System.out.println("X");
        else
        System.out.println("Y");
        
        
    }
}