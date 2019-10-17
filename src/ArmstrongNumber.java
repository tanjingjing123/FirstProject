import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ArmstrongNumber
{
    public static boolean isArmstrong(int N)
    {

        String s=Integer.toString(N);
        int len=s.length();
        int val=N;
        int sum=0;
        while (N!=0){
            int digit=N%10;
            sum+=Math.pow(digit,len);
            N/=10;
        }
        return sum==val;
    }

    public static void main(String[] args)
    {
        boolean res=isArmstrong(153);
        System.out.println(res);
    }
}
