import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int rad;
        float area;
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        rad=sc.nextInt();
        area=(float)pi*rad*rad;
        System.out.format("%.2f",area);
        
    }
}