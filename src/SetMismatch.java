import java.util.HashSet;
import java.util.Set;

public class SetMismatch
{
    public static int[] findErrorNums(int[] nums)
    {
        Set<Integer> p=new HashSet<Integer>();
        int[] arr=new int[2];
        int s=0;
        int diff=0;
        for (int x: nums)
        {
            p.add(x);
            s+=x;
        }

        int a=(nums.length*(nums.length+1))/2;
        diff=a-s;

        for (int x:p)
        {
            a-=x;
        }
        arr[0]=a-diff;
        arr[1]=a;

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 7, 9, 10};
        int[] res = new int[2];
        res = findErrorNums(nums);
    }

}
