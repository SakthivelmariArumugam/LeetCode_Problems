import java.util.ArrayList;
import java.util.Scanner;

public class Rotate_Image {
    public static void main(String args[])
    {
        ArrayList<Integer> s1=new ArrayList<>();
        ArrayList<Integer> s2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Input Matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=i+j;
                if(i>j)
                {
                    continue;
                }
                else
                {
                    s1.add(sum);
                    s2.add(i);
                    s2.add(j);
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            int start=0;
            int end=3;
            while(start<=end)
            {
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.println();
        System.out.println("Output Matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}