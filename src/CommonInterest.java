import java.util.ArrayList;
import java.util.HashMap;

public class CommonInterest
{
    public static String[] findRestaurant(String[] jing, String[] zilin)
    {
        HashMap<String,Integer> hash=new HashMap<String, Integer>();
        for (int i=0;i<jing.length;i++)
        {
            hash.put(jing[i],i);
        }
        int min=Integer.MAX_VALUE;
        int temp=0;
        ArrayList<String> ans=new ArrayList<String>();
        for (int i=0;i<zilin.length;++i)
        {
            if (hash.containsKey(zilin[i])){
                temp=hash.get(zilin[i])+i;
                if (min>temp)
                {
                    ans=new ArrayList<>();
                    ans.add(zilin[i]);
                    min=temp;
                }
                else if (min==temp)
                {
                    ans.add(zilin[i]);
                }
            }
        }

        int n=ans.size();
        String[] ret=new String[n];
        for (int i=0;i<n;++i)
        {
            ret[i]=ans.get(i);
        }
        return ret;
    }

    public static void main(String[] args)
    {
        String[] jing={"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] zilin={"KFC", "Shogun", "Burger King"};
        String[] result=findRestaurant(jing,zilin);
        System.out.println(result);
    }
}
