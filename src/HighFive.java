import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class HighFive
{
    public static int[][] highFive(int[][] items)
    {
        HashMap<Integer, PriorityQueue<Integer>> map=new HashMap<>();

        for (int i=0;i<items.length;i++)
        {
            PriorityQueue<Integer> temp=null;
            if (!map.containsKey(items[i][0]))
            {
                temp=new PriorityQueue<>(Collections.reverseOrder());
            }else {
                temp=map.get(items[i][0]);
            }
            temp.add(items[i][1]);
            map.put(items[i][0],temp);
        }

        int matrix[][]=new int[map.size()][2];

        int m=0;
        for (Map.Entry<Integer,PriorityQueue<Integer>> mp:map.entrySet())
        {
            int average=0,i=0;
            while (i<5)
            {
                average+=mp.getValue().poll();
                i++;
            }
            average/=5;
            matrix[m][0]=mp.getKey();
            matrix[m][1]=average;
            m++;
        }
        return matrix;
    }

    public static void main(String[] args)
    {
        int[][] items={{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        items=highFive(items);
        System.out.println(items);
    }
}
