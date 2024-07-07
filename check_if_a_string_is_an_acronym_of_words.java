import java.util.ArrayList;


public class check_if_a_string_is_an_acronym_of_words {
    public static boolean isAcronym(ArrayList<String> words, String s) {
        String m="";
        for(int i=0;i<words.size();i++)
        {
            m=m+words.get(i).charAt(0);
        }
        if(m.equals(s))
        {
            return true;
        }
        return false;

    }
    public static void main(String args[])
    {
        ArrayList<String> s=new ArrayList<String>();
        s.add("never");
        s.add("gonna");
        s.add("give");
        s.add("up");
        s.add("on");
        s.add("you");
        String k="ngguoy";
        boolean m=isAcronym(s,k);
        System.out.println(m);

    }
}
