import java.util.Scanner;

public class Largest_Of_Two_Numbers_Windows {
    public static int[] function(int[] a)
    {
        int m1[]=new int[2];
        int l=a.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        m1[0]=a[l-2];
        m1[1]=a[l-1];
        return m1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int z[]=new int[k];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=0;
        for(int j=0;j<n;j++)
        {
            l=j+k;
            if(l>n)
            {
                break;
            }
            //System.out.println(l+" ");
            int r1=0;
            for(int k1=j;k1<l;k1++)
            {

                z[r1]=a[k1];
               // System.out.print(z[r1]+" ");
                r1=r1+1;
            }
            //System.out.println();
            int l1[]=function(z);
            System.out.println(l1[0]+" "+l1[1]);
        }

    }

}
