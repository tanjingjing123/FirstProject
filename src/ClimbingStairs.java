public class ClimbingStairs
{
    public static int climbstairs(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int prevfirst=2,prevlast=1;
        int res=0;
        for (int i=3;i<=n;i++){
            res=prevfirst+prevlast;
            prevlast=prevfirst;
            prevfirst=res;
        }
        return res;
    }

    public static void main(String[] args){
        int res=climbstairs(8);
        System.out.println(res);
    }
}
