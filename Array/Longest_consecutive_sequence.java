public class Longest_consecutive_sequence{
    //Bruteforce approach
    static int check_sequence(int [] nums,int key)
    {
        for(int i =0;i<nums.length;i++)
        {
            if(key == nums[i])
            return 1;
        }
        return 0;
    }
    static int  longest_sequence(int []nums)
    {
        int n = nums.length;
        int longest = 1;
        for(int i =0;i<n;i++)
        {
            int ele = nums[i];
            int count =1;
            while(check_sequence(nums, ele+1)==1)
            {
                ele += 1;
                count +=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args)
    {
      int arr[] = {3, 8, 5, 7, 6};
      System.out.println(longest_sequence(arr));   
    }
}