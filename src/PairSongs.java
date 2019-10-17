import java.util.HashMap;
import java.util.Map;

public class PairSongs
{
    public static int numPairsDivoisibleBy60(int[] time)
    {
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<time.length;i++)
        {
            for (int j=60;j<1000;j+=60)
            {
                if (map.containsKey(j-time[i]))
                {
                    result+=map.get(j-time[i]);
                }
            }
            map.put(time[i],map.getOrDefault(time[i],0)+1);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] time={30,20,150,100,40,80,15,45,65,55,35,85};
        int pair;
        pair=numPairsDivoisibleBy60(time);
        System.out.print(pair);
    }
}
