public class FindSubarray
{
    public static int findUnsortedSubarray(int[] nums)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        boolean flag=false;
        for (int i=1;i<nums.length;i++)
        {
            if (nums[i]<nums[i-1])
                flag=true;
            if (flag)
                min=Math.min(min,nums[i]);
        }
        flag=false;
        for (int i=nums.length-2;i>=0;i--)
        {
            if (nums[i]>nums[i+1])
                flag=true;
            if (flag)
                max=Math.max(max,nums[i]);
        }
        int s,t;
        for (s=0;s<nums.length;s++)
        {
            if (min<nums[s])
                break;
        }
        for (t=nums.length-1;t>=0;t--)
        {
            if (max>nums[t])
                break;
        }
        return t-s<0?0:t-s+1;
    }

    public static void main(String[] args)
    {
        int[] arr={2, 6, 4, 8, 10, 9, 15};
        int result;
        result=findUnsortedSubarray(arr);
        System.out.println(result);
    }
}
