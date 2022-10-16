import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v=0,c=0,d=0,w=0;
        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
            if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' )
                v++;
            else if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' )
                v++;
            else if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')
                d++;
            else if(a == ' ')
                w++;
            else 
                c++;
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+w);
        sc.close();
    }
}