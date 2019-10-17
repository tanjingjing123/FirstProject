public class MonotonicArray
{
    public static boolean isMonotonic(int[] A)
    {
        int store=0;
        for (int i=0;i<A.length-1;++i)
        {
            int c=Integer.compare(A[i],A[i+1]);
            if (c!=0)
            {
                if (c!=store && store!=0)
                    return false;
                store=c;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,2,2,4,5,5,6,8,9,9,9,11,10};
        boolean flag=false;
        flag=isMonotonic(arr);
    }
}
