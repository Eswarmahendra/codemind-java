import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,count1=0,count2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            count1++;
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0 && i%2==0)
            count2++;
        }
        if(count1==count2)
        System.out.print("True");
        else
        System.out.println("False");
    }
}