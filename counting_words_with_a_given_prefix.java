import java.awt.*;
import java.util.Scanner;

public class counting_words_with_a_given_prefix {
    public  static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String words[]=new String[n];
        for(int i=0;i<n;i++)
        {
            words[i]= sc.nextLine();
        }
        String pref= sc.nextLine();
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            if(s.length()>=pref.length())
            {
                if(s.substring(0,pref.length()).equals(pref))
                {
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}
