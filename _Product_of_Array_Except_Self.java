import java.util.Scanner;
class Dup
{
    public static void main(String args[])
    {
        int n,pro=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             pro=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                pro=pro*x[j];
                
            }
           
            System.out.print(pro +" ");
        }
        
    }
}