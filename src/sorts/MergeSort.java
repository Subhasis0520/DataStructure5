package sorts;

public class MergeSort {

    public static void mergeSort(int[] arr){
        if (arr.length <= 1) {
            return;
        }
        int[] b = new int[arr.length/2];
        int[] c = new int[arr.length - b.length];

        for (int i=0;i<arr.length/2;i++){
            b[i] = arr[i];
        }
        for (int i=arr.length/2;i<arr.length;i++){
            c[i-arr.length/2] = arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);


    }

    public static void merge(int[] s1, int[] s2, int[] mergedArray) {


        int index1 = 0;
        int index2 =0;
        int i = 0;

        while (index1 < s1.length && index2 < s2.length) {
            if (s1[index1] <= s2[index2]) {
                mergedArray[i] = s1[index1];
                i++;
                index1++;
            } else {
                mergedArray[i] = s2[index2];
                i++;
                index2++;
            }
        }
        while (index1 < s1.length) {
            mergedArray[i] = s1[index1];
            i++;
            index1++;
        }

        while (index2 < s2.length) {
            mergedArray[i] = s2[index2];
            i++;
            index2++;
        }

    }

    public static void main(String[] args) {
        int[] array = {7, 9, 8, 2, 1, 3};
        int n =array.length;
         mergeSort(array);

        for (int i=0; i<array.length;i++){
            System.out.print(array[i] +" ");
        }

    }
}
