public class NoDecreasing
{
    public boolean chechPossibility(int[] nums)
    {
        int k=nums.length,cnt=0;

        for (int i=0;i<k-1 && cnt <=1;++i)
        {
            if (nums[i]>nums[i+1])
            {
                if (i>0)
                {
                    if (nums[i-1]<=nums[i+1])
                        nums[i]=nums[i-1];
                    else
                        nums[i+1]=nums[i];
                }
                ++cnt;
            }
        }
        return cnt<=1;
    }
}
