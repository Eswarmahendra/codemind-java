import java.util.Scanner;
import java.util.Arrays;
class Rev
{
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        int l=str.length();
        for(int i=l-1;i>=0;i--)
        System.out.print(ch[i] );
    }
}