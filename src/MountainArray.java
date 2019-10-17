public class MountainArray
{
    public static boolean validMountainArray(int[] A)
    {
        int N=A.length;
        int i=0;

        while (i+1<N && A[i]<A[i+1])
            i++;

        if (i==0 || i==N-1)
            return false;

        while (i+1<N && A[i]>A[i+1])
            i++;

        return i==N-1;
    }

    public static void main(String[] args)
    {
        int[] testarray={1,3,5,6,9,12,10,8,2,1};
        validMountainArray(testarray);
    }
}
