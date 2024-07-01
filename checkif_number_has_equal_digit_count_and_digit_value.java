import java.util.Scanner;

public class checkif_number_has_equal_digit_count_and_digit_value {
public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        boolean t1=true;

        int c=0;
        for(int i=0;i<num.length();i++)
        {
            int count=0;
            int digit=num.charAt(i)-'0';
            for(int j=0;j<num.length();j++)
            {
                char t=(char)(i+'0');
                int k=Character.compare(t, num.charAt(j));
                if(k==0)
                {
                    count=count+1;
                }
            }
            if(count==digit)
            {
                c=c+1;
            }

        }
        if(c==num.length())
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
