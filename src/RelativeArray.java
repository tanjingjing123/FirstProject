import java.util.Arrays;
import java.util.HashMap;

public class RelativeArray
{
    public static int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int x: arr1){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int[] result=new int[arr1.length];
        int ind=0;
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<map.get(arr2[i]);j++)
            {
                result[ind++]=arr2[i];
            }
            map.remove(arr2[i]);
        }
        int st=ind;
        for (int k: map.keySet()){
            for (int i=0;i<map.get(k);i++)
            {
                result[ind++]=k;
            }
        }
        Arrays.sort(result,st,result.length);
        return result;
    }

    public static void main(String[] args)
    {
        int[] array1={2,3,1,3,2,4,6,7,9,2,19};
        int[] array2={2,1,4,3,9,6};
        int[] result=relativeSortArray(array1,array2);
        for (int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");


    }
}
