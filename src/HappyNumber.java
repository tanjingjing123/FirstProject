import java.util.HashSet;
import java.util.Set;

public class HappyNumber
{
    public static boolean isHappy(int n)
    {
        int happySum=0;
        Set<Integer> prevSums=new HashSet<Integer>();

        while (happySum!=1)
        {
            happySum=0;
            while (n!=0)
            {
                int digit=n%10;
                happySum+=Math.pow(digit,2);
                n=n/10;
            }

            if (!prevSums.add(happySum))
                return false;
            n=happySum;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n=18;
        boolean result;
        result=isHappy(n);
        System.out.println(result);
    }
}
