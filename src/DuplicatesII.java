import java.util.HashMap;
import java.util.Map;

public class DuplicatesII
{
    public static boolean containsDuplicates(int[] nums, int target)
    {
        if (nums.length<=1)
        {
            return false;
        }

        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if (map.containsKey(num))
            {
                if (i-map.get(num) <=target)
                {
                    return true;
                }
            }
            map.put(num,i);
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] nums={1,2,3,1,2,3};
        int target=2;
        boolean result=containsDuplicates(nums,target);
        System.out.println(result);
    }
}
