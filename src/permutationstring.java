import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class permutationstring{
    public static boolean fun(String s1,String s2)
    {
        ArrayList<String> list1=new ArrayList<>();
       for(int i=0;i<s2.length();i++)
       {
           int l=i+s1.length();
           String sum="";
           if(l<s2.length()+1)
           {
               for(int j=i;j<l;j++)
               {

                   String k=String.valueOf(s2.charAt(j));
                   sum=sum+k;

               }
               char b[]=sum.toCharArray();
               Arrays.sort(b);
               sum=String.valueOf(b);
               //System.out.println(String.valueOf(sum));
           }
           list1.add(sum);
       }
       String sum1="";
       for(int i=0;i<s1.length();i++)
       {

           sum1=sum1+String.valueOf(s1.charAt(i));
       }
       char b[]=sum1.toCharArray();
       Arrays.sort(b);
      sum1=String.valueOf(b);
      // System.out.println(sum1);
       if(list1.contains(sum1))
       {
           return true;
       }
       return false;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=fun(s1,s2);
        System.out.println(result);

    }
}
