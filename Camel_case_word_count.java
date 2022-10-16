import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        if(Character.isLowerCase(s.charAt(0)))
            c++;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                c++;
        }
        System.out.print(c);
        sc.close();
    }
}