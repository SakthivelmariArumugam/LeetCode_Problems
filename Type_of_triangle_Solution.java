import java.util.*;
public class Type_of_triangle_Solution {
    public static void main(String args[])
    {
        boolean a,b,c;
        a=false;
        b=false;
        c=false;
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[3];
        for(int i=0;i<3;i++)
        {
            nums[i]=sc.nextInt();
        }
        int count=0;
        if(nums[0]<(nums[1]+nums[2]))
        {
            count=count+1;
        }
        if(nums[1]<(nums[0]+nums[2]))
        {
            count=count+1;
        }
        if(nums[2]<(nums[0]+nums[1]))
        {
            count=count+1;
        }
        if(count==3)
        {
            if((nums[0]==nums[1])&&(nums[1]==nums[2])&&(nums[0]==nums[2]))
            {
                a=true;
            }
            if((nums[0]==nums[1]) || (nums[1]==nums[2]) || (nums[0]==nums[2]))
            {
                b=true;
            }
            else
            {
                c=true;
            }
        }
        if(a==true)
        {
            System.out.println("equilateral");
        }
        else if(b==true)
        {
            System.out.println("isosceles");
        }
        else if(c==true)
        {
            System.out.println("scalene");
        }
        else
        {
            System.out.println("none");
        }
    }
}
