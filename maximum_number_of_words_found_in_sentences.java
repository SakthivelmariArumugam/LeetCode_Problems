import java.util.Scanner;

public class maximum_number_of_words_found_in_sentences {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String sentences[]=new String[n];
        for(int i=0;i<n;i++)
        {
            sentences[i]= sc.nextLine();
        }
        int big=0;
        for(int i=0;i<sentences.length;i++)
        {
            String b[]=sentences[i].split(" ");
            if(b.length>big)
            {
                big=b.length;
            }
        }
        System.out.println(big);
    }
}
