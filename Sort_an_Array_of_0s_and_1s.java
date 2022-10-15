import java.util.Scanner;
class miss
{
    public static void main(String args[])
    {
        int n,sum=0,add=0,res=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int j=0;j<n;j++)
            x[j]=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           if(x[i]==0)
           {
               System.out.print(x[i] +" ");
           }
       }
        for(int i=0;i<n;i++)
       {
           if(x[i]==1)
           {
               System.out.print(x[i] +" ");
           }
       }
       
    }
}