import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class FindBalloons
{
    public static int maxNumberOfBalloon(String text)
    {
        LinkedList<Integer> list=new LinkedList<>();
        int low=0;
        HashMap<String,Integer> map=new HashMap<>();
        for (int i=0;i<text.length();i++)
        {
            map.put(text.substring(i,i+1),map.getOrDefault(text.substring(i,i+1),0)+1);
        }
        list.add(map.get("b"));
        list.add(map.get("a"));
        if (map.get("l")!=null)
        {
            list.add(map.get("l")/2);
        }else {
            list.add(null);
        }
        if (map.get("o")!=null)
        {
            list.add(map.get("o")/2);
        }else {
            list.add(null);
        }

        list.add(map.get("n"));
        if (list.contains(null)){
            return 0;
        }else {
            low= Collections.min(list);
        }
        return low;
    }

    public static void main(String[] args)
    {
        String text="loonbalxballpoon";
        int low=maxNumberOfBalloon(text);
        System.out.println(low);
    }
}
