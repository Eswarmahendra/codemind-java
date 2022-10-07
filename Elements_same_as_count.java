import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int sum=0,count=1,found=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
                if(x[i]==count)
                {
                     System.out.print(x[i] +" ");
                     found=1;
                }  
            }
           
        }
        if(found==0)
        System.out.println("-1");
        
        
    }
}