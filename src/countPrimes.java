public class countPrimes
{
    public static int countPrimes(int n) {
        int cnt = 0;
        for(int i = 2; i < n; i++){
            boolean flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        int target=10;
        int result=countPrimes(target);
        System.out.println(result);
    }
}
