import java.util.*;

public class PowerfulIntegers
{
    public static List<Integer> powerfulIntegers(int x, int y, int bound)
    {
        Set<Integer> result = new HashSet<>();
        for (int a = 1; a < bound; a *= x) {
            for (int b = 1; a + b <= bound; b *= y) {
                result.add(a + b);
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args)
    {
        int x=2,y=3,bound=10;
        List<Integer> res=new ArrayList<>();
        res=powerfulIntegers(x,y,bound);
    }

}
