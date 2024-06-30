import java.util.Scanner;

public class count_the_number_of_consistent_strings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String allowed=sc.nextLine();
        String words[]=new String[n];
        for(int i=0;i<n;i++)
        {
            words[i]=sc.nextLine();
        }
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                char t=words[i].charAt(j);
                String s=Character.toString(t);
                boolean r=allowed.contains(s);
                if(r==false)
                {
                    count=count+1;
                    break;
                }
            }
        }
        int r=words.length-count;
        System.out.println(r);
    }

}
