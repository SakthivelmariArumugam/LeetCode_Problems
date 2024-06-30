import java.util.Scanner;

public class replace_all_digits_with_characters {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                t=t+s.charAt(i);
            }
            else
            {
                int m1=Character.getNumericValue(s.charAt(i));
                m1=m1+(int)s.charAt(i-1);
                char r3=(char)m1;
                t=t+r3;
            }


        }
        System.out.println(t);
    }
}
