import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c=0,d=0;
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();
        for(int i=0; i<N-2;i = i+2)
        {
            if(arr[i] < arr[i+1] && arr[i+1] > arr[i+2])
                c = 0;
            else
            {
                c = 1;
                break;
            }

        }
        if(c == 1)
        {
            for(int i=0; i<N-2;)
            {
                if(arr[i] > arr[i+1] && arr[i+1] < arr[i+2])
                    d = 0;
                else
                {
                    d = 1;
                    break;
                }
                i = i+2;
            }
        }
        if(c == 0 || d == 0)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}