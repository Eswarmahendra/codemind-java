import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,sum=0,found=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]<n1 || x[i]>n2)
            {
                System.out.print(x[i] +" ");
                found=1;
            }
            
            
        }
        if(found==0)
        System.out.println("-1");
        
    }
}