package sorts;

public class QuickSort {

    public static void quickSort(int[] array,int si, int ei) {
        if (si>= ei){
            return;
        }

        int pivotIndex = partition(array,si,ei);
        quickSort(array,si,pivotIndex-1);
        quickSort(array,pivotIndex+1,ei);
    }

    public static int partition(int[] array,int si, int ei) {
        int pivot = array[ei];
        int i = si-1;
        for (int j =si;j< ei;j++){
            if (array[j] < pivot){
                i++;
               // swap
               int temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }

        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] array = {7, 9, 8, 2, 1, 3};
        int n =array.length;
        quickSort(array,0,n-1);

        for (int i=0; i<array.length;i++){
            System.out.print(array[i] +" ");
        }

    }
}
