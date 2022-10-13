import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());
        int min0 = n;
        int c = 0;
        int p = sc.nextInt();
        int q = sc.nextInt();
        for(int i : list)
        {
            if(i >= p && i<= q)
            {
                if(i < min0)
                {
                    min0 = i;
                    c++;
                }
            }
        }
        if(c != 0)
            System.out.print(min0);
        else
            System.out.print(-1);
        sc.close();
        
    }
}