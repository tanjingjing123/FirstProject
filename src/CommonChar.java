import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonChar
{
    public static List<String> commonChars(String[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(String word: A) {
            int[] freq = new int[26];
            for(char ch: word.toCharArray()) {
                freq[ch - 'a']++;
            }
            for(int i = 0; i <= freq.length - 1; i++) {
                map.put(i, Math.min(map.getOrDefault(i, Integer.MAX_VALUE), freq[i]));
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i: map.keySet()) {
            for(int j = 0; j <= map.get(i) - 1; j++) {
                ans.add((char)(i + 'a') + "");
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        String[] A={"cool","lock","cook","cold","oacl","elloc"};
        List<String> result=commonChars(A);
        for (String x: result)
        {
            System.out.print(x+" ");
        }
    }
}
