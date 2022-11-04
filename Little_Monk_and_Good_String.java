import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char ch[]=s.toCharArray();
        int c=0,max=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
           c++;
           else
           {
               c=0;
            }
        max=Math.max(max,c);
          
        }
        System.out.println(max);
       
    }
}
