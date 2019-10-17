public class BinaryNumberAlternateBits
{
    public static boolean hasAlternateBits(int n){
        if (n<=0) return true;
        n ^=(n>>1);
        return (n&(n+1))==0;
    }

    public static void main(String[] args){
        boolean result=hasAlternateBits(50);
        System.out.println(result);
    }
}
