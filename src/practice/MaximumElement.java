package practice;

public class MaximumElement {
    public static void main(String[] args) {
        int arr[] ={10,11,12,13,14,51,65,60,44,72};

        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}
