import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int a,f=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(b[i]!=0 && b[i]!=1)
            {
                f=1;
                System.out.println("False");
                System.exit(0);
            }
        }
        if(f==0)
        {
        System.out.println("True");
        }
        
    }
}