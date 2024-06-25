import java.util.*;
public class minimum_operations_to_collect_element {
    public void minOperations(List<Integer> nums, int k) {
        ArrayList<Integer> s1=new ArrayList<Integer>();
        for(int i=1;i<=k;i++)
        {
            s1.add(i);
        }
        int count=0;
        for(int i=nums.size()-1;i>=0;i--)
        {
            if(s1.isEmpty())
            {
                break;
            }
            if(s1.contains(nums.get(i)))
            {
                count=count+1;
                s1.remove(nums.get(i));
            }
            else
            {
                count=count+1;
            }
        }
        System.out.println("Minimum number of operations:"+count);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> m1=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int r=sc.nextInt();
            m1.add(r);
        }
        int k=sc.nextInt();
        minimum_operations_to_collect_element r1=new minimum_operations_to_collect_element();
        r1.minOperations(m1,k);

    }
}
