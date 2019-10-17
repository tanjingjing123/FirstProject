public class shortestDistance
{
    public static int shortestDistanceII(String[] words,String word1,String word2)
    {
        int i1=-1,i2=-1;
        int minDistance=words.length;
        int currentDistance;
        for (int i=0;i<words.length;i++)
        {
            if (words[i].equals(word1))
            {
                i1=i;
            }else if (words[i].equals(word2)){
                i2=i;
            }

            if (i1!=-1 && i2!=-1){
                minDistance = Math.min(minDistance, Math.abs(i1 - i2));
            }
        }
        return minDistance;
    }

    public static void main(String[] args)
    {
        String[] words={"practice", "makes", "perfect", "coding", "makes"};
        String word1="makes";
        String word2="coding";
        int result;
        result=shortestDistanceII(words,word1,word2);
        System.out.println(result);
    }
}
