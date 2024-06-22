import java.util.Scanner;

public class Longest_Common_Prefix {
        public String longestCommonPrefix(String[] strs) {
            String small=strs[0];
            String m="";
            int k=0;
            for(int i=0;i<strs.length;i++)
            {
                if(strs[i].length()<small.length())
                {
                    small=strs[i];
                }
            }
            for(int i=0;i<small.length();i++)
            {
                k=0;
                for(int j=0;j<strs.length;j++)
                {
                    if(small.charAt(i)==strs[j].charAt(i))
                    {
                        k++;
                    }
                    else
                    {
                        return m;
                    }
                }
                if(k==strs.length)
                {
                    m=m+small.charAt(i);
                }
            }
            return m;

        }
    public static void main(String args[])
    {
        Longest_Common_Prefix l1=new Longest_Common_Prefix();
        Scanner sc=new Scanner(System.in);
        String[] s1=new String[3];
        for(int i=0;i<s1.length;i++)
        {
            s1[i]=sc.nextLine();
        }
        String m1=l1.longestCommonPrefix(s1);
        System.out.println("The Solution String:"+m1);

    }
}
