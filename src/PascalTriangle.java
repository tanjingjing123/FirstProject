import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle
{
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>();

        if (numRows==0)
        {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum=1;rowNum<numRows;rowNum++)
        {
            List<Integer> row=new ArrayList<>();
            List<Integer> prevRow=triangle.get(rowNum-1);

            row.add(1);

            for (int j=1;j<rowNum;j++)
            {
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args)
    {
        int x=5;
        List<List<Integer>> test= Collections.singletonList(new ArrayList<Integer>());
        test=generate(x);

    }
}
