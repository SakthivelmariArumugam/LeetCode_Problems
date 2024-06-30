import java.util.Scanner;

public class robot_return_to_origin {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String moves=sc.nextLine();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<moves.length();i++)
        {
            char s=moves.charAt(i);
            if(s=='U')
            {
                count1=count1+1;
            }
            if(s=='D')
            {
                count2=count2+1;
            }
            if(s=='L')
            {
                count3=count3+1;
            }
            if(s=='R')
            {
                count4=count4+1;
            }
        }

        if(count1==count2 && count3==count4)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
