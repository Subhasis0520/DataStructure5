package sorts;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {7, 9, 8, 2, 1, 3};

        for (int i=0; i<array.length;i++){
            int current = array[i];
            int j =i-1;

            while (j>=0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
//            placed
            array[j+1] = current;
        }
        for (int item:array) {
            System.out.print(item+" ");
        }
    }
}
