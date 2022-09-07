import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        int n,m;
        float avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        avg =(float) (n+m)/2;
        System.out.format("%.4f",avg);
        
    }
}