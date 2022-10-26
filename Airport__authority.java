import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]<=k)
            {
                s++;
            }
            else
            {
                s+=2;
            }
        }
        System.out.print(s);
    }
    
}