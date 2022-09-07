import java.util.Scanner;
class hand
{
    public static void main(String args[])
    {
        int count, n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        count=(n*(n-1))/2;
        System.out.println(count);
        
    }
}