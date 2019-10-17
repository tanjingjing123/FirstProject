import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumPair
{
    private static void minimumAbsoluteDifference(int[] arr)
    {
        Arrays.sort(arr);

        Map<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        int minimum=Integer.MAX_VALUE;

        for (int i=1;i<arr.length;i++)
        {
            if (Math.abs(arr[i]-arr[i-1])<minimum )
            {
                minimum=Math.abs(arr[i]-arr[i-1]);
            }
            int firstElement=arr[i-1];
            int secondElement=arr[i];
            int diff = secondElement - firstElement;
            if (map.containsKey(diff)) {
                ArrayList<Integer> newPair = new ArrayList<>();
                newPair.add(firstElement);
                newPair.add(secondElement);
                map.get(diff).add(newPair);
            } else {
                ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
                ArrayList<Integer> newPair = new ArrayList<>();
                newPair.add(firstElement);
                newPair.add(secondElement);
                newList.add(newPair);
                map.put(diff, newList);
            }
        }
        int[][] result = new int[map.get(minimum).size()][2];
        System.out.println("Sorted Input Array : "+Arrays.toString(arr));
        System.out.println("Minimum Absolute Difference : "+minimum);
    }
    public static void main(String[] args)
    {
        minimumAbsoluteDifference(new int[] {4,2,1,3,6,8});

        System.out.println("==========================");
    }


}
