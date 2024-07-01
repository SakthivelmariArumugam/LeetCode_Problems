import java.util.Scanner;

public class merge_strings_alternately {
    public static String mergeAlternately(String word1, String word2) {
        String t="";
        int t1=0;
        if(word1.length()<word2.length())
        {
            t1=word2.length();
        }
        else
        {
            t1=word1.length();
        }
        for(int i=0;i<t1;i++)
        {
            if(i<word1.length())
            {
                t=t+word1.charAt(i);
            }
            if(i<word2.length())
            {
                t=t+word2.charAt(i);
            }
        }
        return t;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String m=mergeAlternately(s1,s2);
        System.out.println(m);

    }
}
