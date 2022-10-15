import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int s=0;
        int c=x,d=0;
        if(a>b)
        System.out.print("-1");
        else{
            while(c>=d){
                c+=a;
                d+=b;
                s++;
            }
            System.out.print(s);
        }
    }
}