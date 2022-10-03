import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        int n,found=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if((i*(i+1))==n)
            {
               System.out.println("YES");
               found=1;
               break;
            }
            
            
        }
        if(found==0)
        {
            System.out.println("NO");
        }
    }
}