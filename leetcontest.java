import java.util.*;
public class leetcontest {
    public static void main(String args[])
    {
        int ar[] = {1,2,3,4};
        int ar1[] = {6,2,3,4};
        Solution ab = new Solution();
        System.out.println(ab.getCommon(ar, ar1));
    }
}
    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
            int ar[] = new int[nums1.length+nums2.length];
            HashSet<Integer> set = new HashSet<>();
            for(int i =0 ; i<nums1.length;i++)
            {     if(!set.contains(ar[i]))
                    set.add(nums1[i]);
            }
            int k=0;
            for(int i =0;i<nums2.length;i++)
            {
                if(set.contains(nums2[i]))
                    ar[k] = nums2[i];
                k++;
            }
            int min = Integer.MAX_VALUE;
            int n=0;
            for(int i=1;i<ar.length;i++)
            {   
                if(ar[i] < min && ar[i]!=0 )
                    min = ar[i];

                if(ar[i] ==0)
                    n++;
            }
            if(n == ar.length)
                return -1;
            else
                return min;
        }
    }

