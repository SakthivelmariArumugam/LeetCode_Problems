import java.util.Scanner;

public class permutation_difference_between_two_strings {
    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int r=t.indexOf(s.charAt(i));
            sum=sum+Math.abs(i-r);
        }
        return sum;

    }
    public  static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int value=findPermutationDifference(s,t);
        System.out.println(value);

    }
}
