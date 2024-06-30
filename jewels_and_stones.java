import java.util.Scanner;

public class jewels_and_stones {
    public static void main(String args[])
    {
        String jewels,stones;
        Scanner sc=new Scanner(System.in);
        stones=sc.nextLine();
        jewels=sc.nextLine();
        int count=0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++)
            {
                char s=jewels.charAt(i);
                char s2=stones.charAt(j);
                if(s==s2)
                {
                    count=count+1;
                }
            }
        }
        System.out.println("Output:"+count);
    }
}
