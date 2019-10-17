import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber
{
    public static int largestUniqueNumber(int[] A)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for (int a: A)
            map.put(a,map.getOrDefault(a,0)+1);

        int res=-1;
        for (int x:A)
        {
            if (map.get(x)==1 && x>res)
                res=x;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] A={5,7,3,9,4,9,8,3,2,3,5,7,1,7,7};
        int result=largestUniqueNumber(A);
        System.out.println(result);
    }
}
