import java.io.*;
import java.util.*;
class Unique
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ar[]=new int[100]; //array for storing and comparing digits
        int i,j,k=0,a=0,l;
        String str; 
        char ch;
        str= in.nextLine(); //Input number as a string
        l= str.length(); // storing length of string
        if(str.charAt(0)=='0') // if 0 is leading the number
        {
            System.out.println("It is not a Unique Number : " +str);
        }
        else
        {
            for(i=0;i<l;i++)
            {
                ch= str.charAt(i);
                ar[a]=(int)ch; //storing each digit of the number
                a++;
            }
            for(i=0;i<(a-1);i++)
            {
                for(j=i;j<(a-1);j++)
                {
                    if(ar[i]==ar[j+1]) // comparing digits
                    {
                        k=1; // if the digit are same than changing value of k to 1
                        break; //using break statement to jump out of inner for loop
                    }
                }
                if(k==1)
                {
                    break; //using break statement to jump out of outer for loop
                }
            }
            if(k==1) // if k is equal to 1
            {
                System.out.println("Not Unique Number");
            }
            else
            {
                System.out.println("Unique Number");
            }
        }
    } // end of main method
} //