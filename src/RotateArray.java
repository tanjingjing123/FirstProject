import java.awt.desktop.PreferencesEvent;

public class RotateArray
{
    public static void rotate(int[] nums, int k)
    {
        k %=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end)
    {
        while (start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        int[] arr={1,3,4,5,6,7,9,11,14,17,20,22,24,25,27};
        int k=5;
        rotate(arr,k);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
