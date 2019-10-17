import java.util.HashSet;
import java.util.Set;

public class Distribute
{
    public static int distribute(int[] candies)
    {
        Set<Integer> unique=new HashSet<>();
        for (int x: candies)
            unique.add(x);

        return Math.min(candies.length/2,unique.size());
    }

    public static void main(String[] args)
    {
        int[] candies={1,1,2,3,3,4,5,5,6,7};
        int result=distribute(candies);
        System.out.println(result);
    }
}
