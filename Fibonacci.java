import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        int c1=0;
        int c2=1;
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            sum=c1+c2;
            c1=c2;
            c2=sum;

        }
        return sum;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=fib(n);
        System.out.println(value);
    }
}
