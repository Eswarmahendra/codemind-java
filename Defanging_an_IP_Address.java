import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
       int m=s1.length();
       char ch1[]=s1.toCharArray();
        for(int i=0;i<m;i++)
        {
            if(ch1[i]=='.')
                System.out.print("[.]");
            if(ch1[i]!='.')
                System.out.print(ch1[i]);
        }
    }
}