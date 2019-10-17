import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args)
    {
        int[] a = {4, 5, 1, 2, 3, 3};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int start, int end)
    {
        int partition = partition(a, start, end);

        if(partition-1>start) {
            quickSort(a, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(a, partition + 1, end);
        }
    }

    public static int partition(int[] a, int start, int end){
        int pivot = a[end];

        for(int i=start; i<end; i++){
            if(a[i]<pivot){
                int temp= a[start];
                a[start]=a[i];
                a[i]=temp;
                start++;
            }
        }

        int temp = a[start];
        a[start] = pivot;
        a[end] = temp;

        return start;
    }
}
