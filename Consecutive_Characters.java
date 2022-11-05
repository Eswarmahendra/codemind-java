import java.util.*;
class java
{
    public static void main(String args[])
    {
        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        int n=s1.length();
        int m=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                c++;
                m=Math.max(m,c);
                }
                else
                c=0;
            }
        }
        System.out.print(m);
    }
}