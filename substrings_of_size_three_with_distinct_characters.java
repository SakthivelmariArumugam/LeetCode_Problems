import java.util.Scanner;
import java.util.ArrayList;

public class substrings_of_size_three_with_distinct_characters {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        ArrayList<Character> s1=new ArrayList<>();
        int count2=0;
        for(int i=0;i<s.length()-2;i++)
        {
            int count1=0;
            s1.clear();
            char x=s.charAt(i);
            char y=s.charAt(i+1);
            char z=s.charAt(i+2);
            if(!s1.contains(x))
            {
                s1.add(x);
                count1=count1+1;
            }
            if(!s1.contains(y))
            {
                s1.add(y);
                count1=count1+1;
            }
            if(!s1.contains(z))
            {
                s1.add(z);
                count1=count1+1;
            }
            if(count1==3)
            {
                count2=count2+1;
            }
        }
        System.out.println(count2);
    }
}
