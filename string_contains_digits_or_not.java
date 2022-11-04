import java.util.Scanner;
import java.util.Arrays;
class Str
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            String s;
            int c=0,found=0;
        s=sc.next();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                found=1;
            }
        }
        if(found==1)
        System.out.println("Yes");
        else
        System.out.println("No");
        }
    }
}