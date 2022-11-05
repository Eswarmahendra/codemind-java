import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        String s1;
        int f=0;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
       int m=s1.length();
      int c1=-1;
        for(int i=0;i<m;i++)
        {
            int c=0;
                for(int j=0;j<m;j++)
                {
                    if(s1.charAt(i)==s1.charAt(j))
                    {
                        c++;
                    }
                }
            if(c==1)
            {
                c1=i;
                break;
            }
        }
        System.out.println(c1);
    }
}