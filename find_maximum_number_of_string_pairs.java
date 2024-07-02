import java.util.*;
public class find_maximum_number_of_string_pairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        ArrayList<String> s=new ArrayList<String>();
        int count1=0;
        String k="";
        for(int i=0;i<words.length;i++)
        {
            k="";
            char s1=words[i].charAt(0);
            char s2=words[i].charAt(1);
            if(s1<=s2)
            {
                k=k+s1;
                k=k+s2;
            }
            else {
                k = k + s2;
                k = k + s1;
            }
            if(s.contains(k))
            {
                count1=count1+1;
            }
            else
            {
                s.add(k);
            }

        }
        return count1;
    }
    public static void main(String[] args) {
        String a[]={"cd","ac","dc","ca","xx"};
        int m=maximumNumberOfStringPairs(a);
        System.out.println(m);
    }
}
