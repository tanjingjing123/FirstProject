public class ConsecutiveOne
{
    public static int findMaxConsecutive(int[] nums)
    {
        int count=0,max=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
                count++;
            else if (nums[i]==0)
            {
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(max,count);
    }

    public static void main(String[] args)
    {
        int[] nums={0,0,1,1,0,1,1,1,0};
        int result=findMaxConsecutive(nums);
        System.out.println(result);
    }
}
