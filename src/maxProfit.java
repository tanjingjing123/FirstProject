public class maxProfit
{
    public static int maxProfit(int[] prices)
    {
        int maxprofit=0;
        int high=Integer.MIN_VALUE;
        for (int i=prices.length-1;i>=0;i--)
        {
            if (prices[i]>high)
            {
                high=prices[i];
            }else if (high-prices[i]>maxprofit)
                maxprofit=high-prices[i];
        }
        return maxprofit;
    }

    public static void main(String[] args)
    {
        int[] prices={8,2,7,11,19,3,21,6,8,21};
        int result=maxProfit(prices);
    }
}
