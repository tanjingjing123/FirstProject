public class InsertPosition
{
    public static int searchInsert(int[] nums, int target)
    {
        if (target>nums[nums.length-1]){
            return nums.length;
        }

        int s=0;
        int t=nums.length-1;

        while (s<t){
            int m=(s+t)/2;
            if (target>nums[m]){
                s=m+1;
            }else {
                t=m;
            }
        }
        return s;
    }

    public static void main(String[] args)
    {
        int[] arr={1,3,4,5,6,7,9,11,14,17,20,22,24,25,27};
        int target=15;
        int result;
        result=searchInsert(arr,target);
        System.out.println(result);
    }
}
