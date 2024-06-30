import java.util.Scanner;

public class truncate_sentence {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String t1=" ";
        String s=sc.nextLine();
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t==' ')
            {
                count=count+1;
            }
            if(count==k)
            {
                break;
            }
            t1=t1+t;
        }
        System.out.println(t1);
    }
}
