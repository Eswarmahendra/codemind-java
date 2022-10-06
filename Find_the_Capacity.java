import java.util.Scanner;
class Cap
{
    public static void main(String args[])
    {
        int s,t,p,cap;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        t=sc.nextInt();
        p=sc.nextInt();
        cap=s*t*p;
        System.out.println(cap +"KB");
    }
}