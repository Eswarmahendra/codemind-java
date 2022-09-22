import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        int count=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        int k;
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]==k)
            count++;
            
        }
        if(count==0)
        System.out.println("0");
        else
        System.out.println(count);
    }
}