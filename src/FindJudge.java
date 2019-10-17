public class FindJudge
{
    public static int findJudge(int N,int[][] trust){
        int[] trustedBy=new int[N+1];
        int[] peopleTrusted=new int[N+1];
        for (int[] person:trust){
            peopleTrusted[person[0]]++;
            trustedBy[person[1]]++;
        }
        for (int i=1;i<=N;i++)
            if (trustedBy[i]==N-1 && peopleTrusted[i]==0)
                return i;
        return -1;
    }

    public static void main(String[] args)
    {
        int[][] trust={{1,8},{2,7},{5,8},{10,8},{9,10},{2,8},{6,8},{10,5},{4,7},{3,8},{4,2},{4,8},{7,8},{9,8}};
        int N=10;
        int res=findJudge(10,trust);
        System.out.println(res);
    }
}
