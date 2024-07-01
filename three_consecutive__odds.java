import java.util.Scanner;

public class three_consecutive__odds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]%2!=0)
                {
                    count=count+1;
                }
                else
                {
                    count=0;
                }
                if(count==3)
                {
                    return true;
                }
            }
        }
        return false;
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
        boolean s=threeConsecutiveOdds(a);
        System.out.println(s);

    }
}
