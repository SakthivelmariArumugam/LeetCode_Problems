import java.util.ArrayList;
import java.util.Scanner;

public class permutationstring{
    public static boolean fun(String s1,String s2)
    {
        ArrayList<String> list1=new ArrayList<>();
        for(int i=0;i<s2.length()-1;i++)
        {
            String m1="";
            String m2=String.valueOf(s2.charAt(i));
            String m3=String.valueOf(s2.charAt(i+1));
            m1=m2+m3;
            list1.add(m1);
        }
        for(int i=0;i<list1.size();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                System.out.println(list1.get(i));
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=fun(s1,s2);

    }
}
