import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement
{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int[] result=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int temp:nums2){
            while (!stack.isEmpty() && stack.peek()<temp){
                map.put(stack.pop(),temp);
            }
            stack.push(temp);
        }
        for (int i=0;i<result.length;i++){
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] nums1={1,3,5,2,7,12,18};
        int[] nums2={3,1,9,5,20,13,7,9};
        int[] result;
        result=nextGreaterElement(nums1,nums2);
    }
}
