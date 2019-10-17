import java.util.HashSet;

public class RepeatedElement
{
    public static int repeatedNTimes(int[] A)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int value: A){
            if(set.contains(value)){
                return value;
            }else{
                set.add(value);
            }
        } return -1;
    }

    public static void main(String[] args)
    {
        int[] A={9,7,3,3,8,3,3,4,2,1,3,6,3,5,3,3};
        int res=repeatedNTimes(A);
        System.out.println(res);
    }
}
