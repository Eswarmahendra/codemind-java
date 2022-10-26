import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0, d = 0;
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
                c++;
            else
                d++;
        }
        System.out.print(c + " " + d);
        sc.close();
    }
}