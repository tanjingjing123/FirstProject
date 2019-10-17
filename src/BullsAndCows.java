public class BullsAndCows
{
    public static String getHint(String secret, String guess)
    {
        int[] s=new int[10];
        int[] g=new int[10];
        int count=0;
        int count2=0;
        for (int i=0;i<secret.length();i++)
        {
            char ch1=secret.charAt(i);
            char ch2=guess.charAt(i);
            s[ch1-'0']++;
            g[ch2-'0']++;
            if (ch1==ch2)
            {
                count++;
            }
        }

        for (int i=0;i<10;i++)
        {
            count2+=Math.min(s[i],g[i]);
        }
        count2=count2-count;
        String res="";
        return res+String.valueOf(count)+"A"+String.valueOf(count2)+"B";
    }

    public static void main(String[] args)
    {
        String secret="180766579";
        String guess="781069111";
        String res=getHint(secret,guess);
        System.out.println(res);
    }
}
