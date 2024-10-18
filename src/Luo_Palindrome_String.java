import java.util.Scanner;

public class Luo_Palindrome_String {
    public static int fun(Scanner sc)
    {
        String s=sc.nextLine();
        int l=0;
        int r=s.length();
        int sum1=0;
        int sum2=0;
        while(l<s.length())
        {
            if(s.charAt(l)!=s.charAt(s.length()-1))
            {
                sum1=s.length()-l-1;
                break;
            }
            l++;
        }
        while(r>=0)
        {
            if(s.charAt(0)!=s.charAt(r))
            {
                sum2=r+1;
                break;
            }
            r--;
        }
        if(sum1>sum2)
        {
            return sum1;
        }
        return sum2;

    }
    public static void Main(String args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a1=fun(sc);
            a[i]=a1;
        }
    }
}
