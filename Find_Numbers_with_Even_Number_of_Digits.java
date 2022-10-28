import java.util.*;
class even
{
    public static boolean isEven(int m)
    {
        int s=0,rem=0;
        while(m>0)
        {
            rem=m%10;
            s++;
            m=m/10;
            
        }
        if(s%2==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int [n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(isEven(x[i]))
            c++;
        }
        System.out.println(c);
    }
}