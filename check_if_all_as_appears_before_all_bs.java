import java.util.Scanner;

public class check_if_all_as_appears_before_all_bs {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        boolean k=true;
        for(int i=0;i<s.length()-1;i++)
        {
            char t1=s.charAt(i);
            char t2=s.charAt(i+1);
            if(t1=='b'&&t2=='a')
            {
                k=false;
            }
            else
            {
                continue;
            }

        }
        if(k==true)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
