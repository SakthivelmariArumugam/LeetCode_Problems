import java.util.Scanner;

public class pminimum_bit_flips_to_convert_number {
        public static int minBitFlips(int start, int goal) {
            String a="";
            String b="";
            while(start>0)
            {
                int m=start%2;
                String k="";
                k=String.valueOf(m);
                a=a+k;
                start=start/2;
            }
            while(goal>0)
            {
                int n=goal%2;
                String k1="";
                k1=String.valueOf(n);
                b=b+k1;
                goal=goal/2;
            }
            if(b.length()<a.length())
            {
                while(b.length()!=a.length())
                {
                    b=b+"0";
                }
            }
            if(a.length()<b.length())
            {
                while(b.length()!=a.length())
                {
                    a=a+"0";
                }
            }
            int count=0;
            int i=0;
            while(i<a.length())
            {
                if(a.charAt(i)!=b.charAt(i))
                {
                    count=count+1;
                }
                i++;
            }
            return count;

        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int goal=sc.nextInt();
        int answer=minBitFlips(start,goal);
        System.out.println(answer);

    }
}
