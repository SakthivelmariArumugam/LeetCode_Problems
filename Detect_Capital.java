import java.util.Scanner;

public class Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            int m=(int)word.charAt(i);
            if(m>=65 && m<=90)
            {
                count=count+1;
            }
        }
        if(count==word.length())
        {
            return true;
        }
        if(count==0)
        {
            return true;
        }
        if((int)word.charAt(0)>=65&&(int)word.charAt(0)<=90&&count==1)
        {
            return true;
        }
        return false;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean m=detectCapitalUse(s);
        System.out.println(m);
    }
}
