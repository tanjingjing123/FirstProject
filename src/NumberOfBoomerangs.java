import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs
{
    public static int numberOfBoomerangs(int[][] points)
    {
        if (points==null||points.length==0||points[0].length==0){
            return 0;
        }
        int cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<points.length;i++)
        {
            for (int j=0;j<points.length;j++)
            {
                if (i==j)
                {
                    continue;
                }
                int distance=(points[j][0]-points[i][0])*(points[j][0]-points[i][0]) + (points[j][1]-points[i][1]) * (points[j][1]-points[i][1]);
                cnt+=map.getOrDefault(distance,0)*2;
                map.put(distance,map.getOrDefault(distance,0)+1);
            }
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        int[][] points={{0,0},{1,0},{2,0},{3,0},{5,0},{6,0},{7,0}};
        int res=numberOfBoomerangs(points);
        System.out.println(res);
    }
}
