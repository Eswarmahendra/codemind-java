import java.util.Scanner;
class ascii
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int ascii=ch;
        System.out.println(ascii);
    }
}