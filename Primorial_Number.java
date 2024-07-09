import java.util.Scanner;

public class Primorial_Number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long count=0;
        long r=2;
        long sum=1;
        boolean k=true;
        while(r>=2)
        {
            k=true;
            if(count>=n)
            {
                break;
            }
            if(r==2)
            {
                sum=sum*r;
                count=count+1;
                r++;
                continue;
            }

            for(long i=2;i<=Math.sqrt(r);i++)
            {
                if(r%i==0)
                {
                    k=false;
                    break;
                }
            }
            if(k==false)
            {
                r++;
                continue;
            }
            else
            {
                sum=sum*r;
                count=count+1;
            }
            r++;
        }
        System.out.print(sum);
    }
}
