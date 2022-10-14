import java.util.Scanner;
class count
{
    public static boolean ispal(int x)
    {
        int count=0,rem=0,rev=0,y;
        y=x;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(y==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n,m,count=0;
        Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            m=sc.nextInt();
            if(ispal(m))
            count++;
        }
        System.out.println(count);
    }
}