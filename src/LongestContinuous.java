public class LongestContinuous
{
    public static int findLength(int[] nums)
    {
        if (nums.length==0||nums.length==1)
            return nums.length;
        int max=0;
        int count=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i+1]<=nums[i])
                count=0;
            else if (nums[i+1]>nums[i])
                count++;
            max=Math.max(max,count);
        }
        return max+1;
    }

    public static void main(String[] args)
    {
        int[] nums={1,3,5,4,7};
        int result=findLength(nums);
        System.out.println(result);
    }
}
