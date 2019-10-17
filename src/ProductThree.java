public class ProductThree
{
    public static int maxProduct(int[] nums)
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int n=nums.length;
        if (n==3)
            return nums[0]*nums[1]*nums[2];
        else {
            for (int x:nums)
            {
                if (x>=max1)
                {
                    max3=max2;
                    max2=max1;
                    max1=x;
                }else if (x>=max2)
                {
                    max3=max2;
                    max2=x;
                }else if (x>=max3)
                {
                    max3=x;
                }
            }
            return max1*max2*max3;
        }

    }

    public static void main(String[] args)
    {
        int[] nums={1,3,10,5,7,14,9,11,4,6,8};
        int result=maxProduct(nums);
        System.out.println(result);
    }
}
