import java.util.*;
public class points_that_intersect_with_car {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();

        // Add rows to the 2D ArrayList
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(3);
        row1.add(6);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(5);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(4);
        row3.add(7);
        nums.add(row1);
        nums.add(row2);
        nums.add(row3);
                ArrayList<Integer> s1=new ArrayList<Integer>();
                for(int i=0;i<nums.size();i++)
                {
                    for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++)
                    {
                        if(!s1.contains(j))
                        {
                            s1.add(j);
                        }
                    }
                }
               System.out.println("The Answer:"+s1.size());

    }
}
