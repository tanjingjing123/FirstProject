public class Removeelement
{
    public static int removeElement(int[] nums, int val)
    {
        int i=0;
        for (int j=0;j<nums.length;j++)
        {
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
        int[] arr={1,3,4,5,4,7,9,4,14,4,20,22,24,4,27};
        int target=4;
        int result=removeElement(arr,target);
        System.out.print(result);

    }
}
