import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();
        for(int i=0; i<N; i++)
        {
            int c = 0;
            for(int j=0; j<N; j++)
            {
                if(arr[i] == arr[j])
                    c++;
            }
            if(c == 1)
            {
                if(max < arr[i])
                    max = arr[i];
            }
        }
        if(max == 0)
            System.out.println(-1);
        else
            System.out.println(max);
      
    }
}