import java.util.*;
public class find_the_distinct_difference_array {
    public static int[] distinctDifferenceArray(int[] nums) {
        int b[]=new int[nums.length];
        ArrayList<Integer> s1=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            s1.clear();
            int count1=0;
            for(int j=0;j<=i;j++)
            {
                if(!s1.contains(nums[j]))
                {
                    count1=count1+1;
                    s1.add(nums[j]);
                }

            }
            s1.clear();
            int count2=0;
            for(int k=i+1;k<nums.length;k++)
            {
                if(!s1.contains(nums[k]))
                {
                    count2=count2+1;
                    s1.add(nums[k]);
                }

            }
            int sum=count1-count2;
            b[i]=sum;
        }
        return b;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int m[]=distinctDifferenceArray(a);
        for(int i=0;i<m.length;i++)
        {
            System.out.print(m[i]+" ");
        }
    }
}
