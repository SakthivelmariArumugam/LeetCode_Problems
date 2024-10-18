import java.util.Scanner;

public class Luo_Palindrome_String {
    public static int fun(Scanner sc)
    {
        String s1=sc.nextLine();
        int l=0;
        int r=s1.length()-1;
        int sum1=0;
        int sum2=0;
        while(l<s1.length())
        {
            if(s1.charAt(l)!=s1.charAt(s1.length()-1))
            {
                sum1=s1.length()-l-1;
                break;
            }
            l++;
        }
        while(r>0)
        {
            if(s1.charAt(0)!=s1.charAt(r))
            {
                sum2=r+1;
                break;
            }
            r--;
        }
        if(sum1==0 && sum2==0)
        {
            return -1;
        }
        if(sum1>sum2)
        {
            return sum1;
        }
        return sum2;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++) {

            int a1 = fun(sc);
            System.out.println(a1);
        }

    }
}
