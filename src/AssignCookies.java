import java.util.Arrays;

public class AssignCookies
{
    public static int findContentchildren(int[] greedyFactor,int[] cookies){
        Arrays.sort(greedyFactor);
        Arrays.sort(cookies);
        int x=0;
        int cookieIndex=-1;
        for (int i=0;i<greedyFactor.length;i++){
            cookieIndex++;
            if (cookieIndex>=cookies.length)
                break;
            if (cookies[cookieIndex]>=greedyFactor[i]){
                x++;
            }else{
                i--;
            }
        }
        return x;
    }

    public static void main(String[] args){
        int[] greedyFactor={1,2,3,5,8,3,5,2,4};
        int[] cookies={2,3,1,4,5,9,1,2,2};
        int res=findContentchildren(greedyFactor,cookies);
        System.out.println(res);
    }
}
