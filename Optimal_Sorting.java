import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            int flag=1;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
                flag=0;
            }
            Arrays.sort(a);
            if(flag==1)
            System.out.println("0");
            else
            System.out.println(a[n-1]-a[0]);
            t--;
        }
    }
}