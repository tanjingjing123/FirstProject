import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestwordinDictionary
{
    public static String longestWord(String[] words)
    {
        Arrays.sort(words);
        Set<String> backup=new HashSet<>();
        String res="";

        for (String x: words)
        {
            if (x.length()==1||backup.contains(x.substring(0,x.length()-1)))
            {
                backup.add(x);
                if (res.length()<x.length()||(res.length()==x.length()&& res.compareTo(x)>0))
                    res=x;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        String[] words={"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String res=longestWord(words);
    }
}
