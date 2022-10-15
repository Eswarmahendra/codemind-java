import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,max=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]==1)
            {
                c++;
            }
            else
            c=0;
            if(c>max)
            {
                max=c;
            }
        }
        System.out.println(max);
    }
}