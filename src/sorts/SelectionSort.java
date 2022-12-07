package sorts;

/*
       It is not a good technic because it's time complexity is O(n^2)
 */

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {7, 9, 8, 2, 1, 3};

//        selection sort
        for (int i =0; i<array.length-1;i++){
            int smallest = i;
            for (int j =i+1; j<array.length; j++){
                if (array[smallest] > array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        for (int item:array) {
            System.out.print(item+" ");
        }
    }
}
