import java.util.Arrays;

public class LastStoneWeight
{
    public static int lastStoneWeight(int[] stones){
        if (stones.length==1) return stones[0];
        int stones_num=stones.length;
        int x=stones.length-2;
        int y=stones.length-1;
        Arrays.sort(stones);

        while (stones_num>1){
            if (stones[x]==stones[y]){
                stones_num-=2;
                stones[x]=0;
                stones[y]=0;
            }else {
                stones_num-=1;
                stones[y]=stones[y]-stones[x];
                stones[x]=0;
            }
            Arrays.sort(stones);
        }
        return stones[stones.length-1];
    }

    public static void main(String[] args)
    {
        int[] stones={2,7,4,1,8,1,9,15,12,6,19,21,20};
        int res=lastStoneWeight(stones);
        System.out.println(res);
    }


}
