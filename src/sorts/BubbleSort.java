package sorts;

/*
       It is not a good technic because it's time complexity is O(n^2)
 */

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {7, 9, 8, 2, 1, 3};

//        bubble sort
        for (int i = 0; i < array.length - 1; i++) {     // outer loop
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int item:array) {
            System.out.print(item+" ");
        }
    }
}