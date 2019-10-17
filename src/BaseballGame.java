import java.util.Stack;

public class BaseballGame
{
    public static int calPoints(String[] ops)
    {
        int lastOne=0;
        int lastTwo=0;
        int result=0;
        Stack<Integer> stack=new Stack<>();

        for (String s:ops)
        {
            if (s.equals("+"))
            {
                lastOne=stack.pop();
                lastTwo=stack.peek();
                stack.push(lastOne);
                stack.push(lastOne+lastTwo);
                result+=(lastOne+lastTwo);
            }else if (s.equals("D"))
            {
                lastOne=stack.peek();
                stack.push(lastOne*2);
                result+=lastOne*2;
            }else if (s.equals("C"))
            {
                result-=stack.pop();
            }else {
                stack.push(Integer.valueOf(s));
                result+=Integer.valueOf(s);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String[] ops={"5","2","C","D","+"};
        int result=calPoints(ops);
    }
}
