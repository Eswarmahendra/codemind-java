import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        int n,k,count=0;
        int x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]%k!=0)
            count++;
        }
        System.out.println(count);
    }
}