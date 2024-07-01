import java.util.Arrays;
import java.util.Scanner;

public class replace_elements_with_greatest_element_on_right_side {
    public static int[] replaceElements(int[] arr) {
        int big=-1;
        int b[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
            big=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>big)
                {
                    big=arr[j];
                }
            }
            b[i]=big;
        }
        b[arr.length-1]=-1;
        return b;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c[]=replaceElements(a);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
