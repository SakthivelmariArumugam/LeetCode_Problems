import java.util.Scanner;

public class concatenation_of_array {
    public static int[] getConcatenation(int[] nums) {
        int b[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            b[i]=nums[i];
        }
        for(int j=0;j<nums.length;j++)
        {
            b[nums.length+j]=nums[j];
        }
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
        int c[]=getConcatenation(a);
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }

    }
}
