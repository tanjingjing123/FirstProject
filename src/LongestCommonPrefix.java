public class LongestCommonPrefix
{
    public static String longestCommonPrefix(String[] strs){
        String prefix="";
        if (strs.length==0) return prefix;
        int n=strs.length;
        for (int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for (int j=1;j<n;j++){
                if (strs[j].length()==i || strs[j].charAt(i)!=ch) return prefix;
            }
            prefix+=ch;
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] strs={"flower","floor","florex","floped","floch","floppx"};
        String res=longestCommonPrefix(strs);
        System.out.println(res.toString());
    }
}
