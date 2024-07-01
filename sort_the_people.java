import java.util.*;
public class sort_the_people {
    public static void main(String args[])
    {
        String names[]={"Mary","John","Emma"};
        int heights[]={180,165,170};
        String b[]=new String[names.length];
        int a[]=new int[names.length];
        for(int i=0;i<heights.length;i++)
        {
            a[i]=heights[i];
            System.out.println(a[i]);
        }


        for(int i=0;i<heights.length-1;i++)
        {
            if(heights[i]<heights[i+1])
            {
                int temp= heights[i];
                heights[i]=heights[i+1];
                heights[i+1]=temp;
                i=-1;
            }
        }
        for(int i=0;i<heights.length;i++)
        {
            System.out.println(heights[i]);
        }
        for(int i=0;i<heights.length;i++)
        {
                int index=-1;
                for(int j=0;j<a.length;j++)
                {
                    if(heights[i]==a[j])
                    {
                        index=j;
                        break;
                    }
                }
                System.out.println(index);
                b[i]=names[index];
        }

       for(int i=0;i<names.length;i++)
       {
           System.out.println(b[i]);
       }
    }
}
