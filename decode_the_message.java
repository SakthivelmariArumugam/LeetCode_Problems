import java.util.Scanner;

public class decode_the_message {
    public  static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String key=sc.nextLine();
        String message=sc.nextLine();
        String t="";
        String t2="";
        for(int i=0;i<key.length();i++)
        {
            char m=key.charAt(i);
            if(t.contains(String.valueOf(m)))
            {
                continue;
            }
            else if(m==' ')
            {
                continue;
            }
            else
            {
                t=t+m;
            }
        }
        for(int i=0;i<message.length();i++)
        {
            char r=message.charAt(i);
            int r2=t.indexOf(r);
            int r3=97+r2;
            char m2=(char)r3;
            if(r==' ')
            {
                t2=t2+r;
            }
            else
            {
                t2=t2+m2;
            }
        }
        System.out.println(t2);

    }
}
