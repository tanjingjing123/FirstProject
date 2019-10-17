import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII
{
    public static List<Integer> getRow(int rowIndex)
    {
        List<Integer> result=new ArrayList<Integer>();
        if (rowIndex<0)
            return result;

        for (int i=0;i<rowIndex+1;i++)
        {
            result.add(0,1);
            for (int j=1;j<result.size()-1;j++)
            {
                result.set(j,result.get(j)+result.get(j+1));
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int x=4;
        List<Integer> test=new ArrayList<Integer>();
        test=getRow(x);

    }
}
