import java.util.*;
public class minimum_string_length_after_removing_substrings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> s1=new Stack<Character>();
        s1.push('a');
        s1.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char k=s.charAt(i);
            if((s1.peek()=='A' && k=='B')||(s1.peek()=='C' && k=='D'))
            {
                s1.pop();
            }
            else
            {
                s1.push(k);
            }
        }
        System.out.println("The output:"+(s1.size()-1));
    }
}
