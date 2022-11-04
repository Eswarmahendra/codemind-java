import java.util.*;
class java
{
    public static void main(String args[])
    {
        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        int n=s1.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);
            if(ch=='U')
            sum=sum+1;
            if(ch=='D')
            sum=sum-1;
            if(ch=='R')
            sum=sum+2;
            if(ch=='L')
            sum=sum-2;
        }
        if(sum==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}