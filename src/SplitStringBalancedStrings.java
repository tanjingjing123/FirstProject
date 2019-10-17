import java.util.Stack;

public class SplitStringBalancedStrings
{
    public static int balancedStringSplit(String s){
        Stack<Character> stack=new Stack<>();
        int res=0;
        for (char ch:s.toCharArray()){
            if (stack.isEmpty()||stack.peek()==ch){
                stack.push(ch);
            }else {
                stack.pop();
            }
            if (stack.isEmpty()){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        String s="RLRRLLRLRL";
        int res=balancedStringSplit(s);
        System.out.println(res);
    }
}
