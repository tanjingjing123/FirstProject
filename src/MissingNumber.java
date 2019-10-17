import java.util.HashSet;
import java.util.Set;

public class MissingNumber
{
    public static int missingNumber(int[] nums)
    {
        Set<Integer> numSet=new HashSet<Integer>();
        for (int num: nums) numSet.add(num);

        int expectedNumCount=nums.length+1;
        for (int number=0;number<expectedNumCount;number++)
        {
            if (!numSet.contains(number))
            {
                return number;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr={9,6,4,2,3,5,7,0,1};
        int result;
        result=missingNumber(arr);
    }
}
