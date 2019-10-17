public class ConfusingNumber
{
    public static boolean confusingNumber(int N){
        String s=String.valueOf(N);
        String ans="";
        for (int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if (c == '0' || c == '1' || c == '8') {
                ans+=String.valueOf(c);
            }else if (c=='6'){
                ans+='9';
            }else if (c=='9'){
                ans+='6';
            }else {
                return false;
            }
        }
        return !ans.equals(s);
    }

    public static void main(String[] args){
        boolean res=confusingNumber(8689);
        System.out.println(res);
    }
}
