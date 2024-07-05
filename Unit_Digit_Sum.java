import java.util.ArrayList;
import java.util.Scanner;

public class Unit_Digit_Sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long k1=n%10;
        Long s=n;
        int count=0;
        ArrayList<Long> s1=new ArrayList<Long>();
        ArrayList<Long> s2=new ArrayList<Long>();
        while(s>0)
        {
            Long m=s%10;
            s1.add(m);
            s=s/10;
        }
        for(int i=1;i<s1.size();i++)
        {
            for(int j=1;j<s1.size();j++)
            {
                Long sum=s1.get(i)+s1.get(j);
                if(sum==k1 && !s2.contains(s1.get(i)) && !s2.contains(s1.get(j)) && i!=j)
                {
                    s2.add(s1.get(i));
                    s2.add(s1.get(j));
                    count=count+1;
                }
            }
        }
        if(count!=0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println(-1);
        }

    }

}
