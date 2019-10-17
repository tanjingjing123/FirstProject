import java.util.HashMap;

public class MajorityElement
{
    public static int majority(int[] nums)
    {
        HashMap<Integer,Integer> Orimap=new HashMap<>();
        HashMap<Integer,Integer> Recordmap=new HashMap<>();
        int c=0;

        for (int i=0;i<nums.length;i++)
        {
            if (Recordmap.containsKey(nums[i]))
            {
                Recordmap.put(nums[i],Recordmap.get(nums[i])+1);
            }else {
                Orimap.put(c,nums[i]);
                Recordmap.put(nums[i],1);
                c++;
            }
        }

        for (int i=0;i<Orimap.size();i++)
        {
            if (Recordmap.get(Orimap.get(i))>nums.length/2)
            {
                c=Orimap.get(i);
                return c;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] nums={3,3,1,1,2,2,3,3,4,3,3,2,1,3,3,3,3,4,5,3,3,1};
        int result=majority(nums);
        System.out.println(result);
    }
}
