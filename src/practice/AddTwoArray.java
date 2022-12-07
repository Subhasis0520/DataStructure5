package practice;

public class AddTwoArray {
    public static void main(String[] args) {

        int arr1[] ={2,5,7,9,13,20};
        int arr2[] ={3,6,8,10};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr[] = new int[n1+n2];

        for (int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr[i+n1]=arr2[i];
        }
        for (int item:arr) {
            System.out.print(item+" ");
        }
    }
}
