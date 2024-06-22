import java.util.Scanner;
import java.util.ArrayList;

public class Longest_Sub_String {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> s1=new ArrayList<Character>();

        int i=0;
        int m=0;
        int big=0;
        while(i<s.length())
        {
            if(!s1.contains(s.charAt(i)))
            {
                s1.add(s.charAt(i));
            }
            else
            {
                if(s1.size()>big)
                {
                    big=s1.size();
                }
                s1.clear();
                m=m+1;
                i=m;
                continue;
            }
            i++;
        }
        if(s1.size()>big)
        {
            return s1.size();
        }
        return big;

    }
    public static void main(String args[])
    {
          Longest_Sub_String sa=new Longest_Sub_String();
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          int b=sa.lengthOfLongestSubstring(s);
          System.out.println("Longest Sub String:"+b);bb

    }
}
