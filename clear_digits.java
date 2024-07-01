import java.util.Scanner;
import java.util.*;

public class clear_digits {
    public static String clearDigits(String s) {
        String m="";
        Stack<Character> s1=new Stack<>();
        s1.push('A');
        s1.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            boolean result1=Character.isLetter(s1.peek());
            boolean result2=Character.isDigit(s.charAt(i));
            if(result1 && result2)
            {
                s1.pop();
            }
            else
            {
                s1.push(s.charAt(i));
            }
        }
        while(!s1.empty())
        {
            char t=s1.pop();
            if(t!='A')
            {
                m=t+m;
            }
        }
        return m;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String t=clearDigits(s1);
        System.out.println(t);

    }
}
