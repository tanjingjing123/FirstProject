public class ShellSort
{
    public static void printArray(Comparable[] a)
    {
        int n=a.length;
        for (int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }



    public static void sort(Comparable[] a)
    {
        int N=a.length;
        int h=1;
        while (h<N/3) h=3*h+1;
        while (h>=1)
        {
            for (int i=h;i<N;i++)
            {
                for (int j=i;j>=h && less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h=h/3;
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a,int i,int j)
    {
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void main(String args[])
    {
        String a[]={"S","H","E","L","L","S","O","R","T","E","X","A","M","P","L","E"};
        System.out.println("Array before sorting");
        printArray(a);

        ShellSort ob=new ShellSort();
        ob.sort(a);

        System.out.println("Array after sorting");
        printArray(a);
    }
}
