import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char ch;
        int c=0,found=0;
     
        ch=sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(ch==s.charAt(i))
            {
                c++;
                found=1;
            }
        }
        if(found==0)
        System.out.println("-1");
        else
        System.out.println(c);
    }
}