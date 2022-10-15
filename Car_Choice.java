import java.util.*;
class Car
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
           float a=sc.nextFloat();
           float b=sc.nextFloat();
           float c=sc.nextFloat();
           float d=sc.nextFloat();
           double e=c/a;
           double f=d/b;
            if(e>f)
            System.out.println("1");
            else if(e<f)
            System.out.println("-1");
            else if(e==f)
            System.out.println("0");
            t--;
        }
    }
}
