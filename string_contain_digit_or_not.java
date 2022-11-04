import java.util.Scanner;
import java.util.Arrays;
class Str
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        int c=0,found=0;
        s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=47 && s.charAt(i)<=57)
            {
                c++;
                found=1;
            }
        }
        if(found==0)
        System.out.println("Doesn't contain digit");
        else
        System.out.println("Contains "+c +" digit");
    }
}