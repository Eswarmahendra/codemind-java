import java.util.Scanner;
import java.util.Arrays;
class stringmax
{
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        String s=s1+s2;
        char a[]=s.toCharArray();
        Arrays.sort(a);
        String k=new String(a);
        System.out.println(k);
    }
}