import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] = new int[a+b];
            for(int j=0; j<a+b; j++)
                arr[j] = sc.nextInt();
            Arrays.sort(arr);
            for(int j=0; j<a+b-1; j++)
                System.out.print(arr[j] + " ");
            System.out.print(arr[a+b-1]);
            System.out.println();
        }
        sc.close();
    }
}