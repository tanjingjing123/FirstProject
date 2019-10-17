import java.util.Stack;

public class RemoveAdjacentDuplicates
{
    public static String removeDuplicates(String S)
    {
        Stack<Character> charStack=new Stack<>();
        for (int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if (!charStack.empty())
            {
                if (ch==charStack.peek()){
                    charStack.pop();
                }
                else {
                    charStack.push(ch);
                }
            }
            else {
                charStack.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (char item:charStack)
        {
            sb.append(item);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String S="abbaca";
        String x=removeDuplicates(S);
    }
}
