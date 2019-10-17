import java.util.HashSet;

public class Square
{
    public static boolean judgeSquareSum(int c){
        int i=0;
        int j=(int)Math.sqrt(c);
        while (i<=j){
            int sum=i*i+j*j;
            if(i*i+i*i==c)
                return true;
            else if (i*i+j*j<c){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args){
        boolean res=judgeSquareSum(5);
        System.out.println(res);
    }

}
