public class AddDigits
{
    public static int addDigits(int num)
    {
        int x=0;
        while (num>0) {
            x += num % 10;
            num /= 10;
            if (x > 9 && num == 0) {
                num = x;
                x = 0;
            }
        }
        return x;
    }
    public static void main(String[] args)
    {
        int res=addDigits(6784);
        System.out.println(res);
    }
}
