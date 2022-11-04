import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char c=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
          if(s.charAt(i)>c)
          {
              c=s.charAt(i);
          }
        }
        System.out.print(c);
    }
}