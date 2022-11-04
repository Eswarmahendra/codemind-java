import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                int a=Character.getNumericValue(s.charAt(i));
                c=c+a;
                
            }
        }
        System.out.println(c);
    }
}