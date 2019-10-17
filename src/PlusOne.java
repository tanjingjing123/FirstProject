public class PlusOne
{
    public static int[] plusOne(int[] digits)
    {
        for (int i=digits.length-1;i>=0;i--)
        {
            if (digits[i]!=9)
            {
                digits[i]++;
                break;
            }else {
                digits[i]=0;
            }
        }
        if (digits[0]==0)
        {
            int[] result=new int[digits.length+1];
            result[0]=1;
            return result;
        }
        return digits;
    }
    public static void main(String[] args)
    {
        int[] arr={0,2,3,9};
        int[] result=plusOne(arr);
        for (int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
}
