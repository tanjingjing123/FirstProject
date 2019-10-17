public class maxDistance
{
    public static int maxDistance(int[][] list)
    {
        int res=0,min_val=list[0][0],max_val=list[0][list[0].length-1];
        for (int i=1;i<list.length;i++)
        {
            res=Math.max(res,Math.max(Math.abs(list[i][list[i].length-1]-min_val),Math.abs(max_val-list[i][0])));
            min_val=Math.min(min_val,list[i][0]);
            max_val=Math.max(max_val,list[i][list[i].length-1]);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5},{1,2,6},{3,4,10},{-10,-8,1}};
        int result;
        result=maxDistance(arr);
        System.out.println(result);
    }
}
