import java.util.*;
class Rober{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            c++;
        }
        if(c<=2)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}