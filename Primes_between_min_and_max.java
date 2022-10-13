import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());
        int a = list.indexOf(Collections.min(list));
        int b = list.indexOf(Collections.max(list));
        int p=0,q=0;
        if(a > b)
        {
            p = b;
            q = a;
        }
        else
        {
            q = b;
            p = a;
        }
        for(int i=p; i<=q; i++)
        {
            int s = list.get(i);
            int c = 0;
            for(int j=2; j<=(int)Math.sqrt(s); j++)
            {
                if(s%j == 0)
                    c++;
            }
            if(s < 2)
                c = 1;
            if(c == 0)
                count++;
        }
        System.out.print(count);
        sc.close();
    }
}