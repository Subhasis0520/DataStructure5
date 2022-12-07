package sorts;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int si, int ei, int x){
        if(si > ei){
            return -1;
        }
        int midIndex = (si+ei) /2;
        if (x == arr[midIndex]){
            return midIndex;
        }

        if (arr[midIndex] < x){
            return binarySearch(arr, midIndex+1,ei,x);
        }else {
            return binarySearch(arr,si,midIndex-1,x);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextByte();
        int arr[] = new int[n];

        System.out.println("Enter the elements");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element want to search");
        int a = sc.nextInt();

        System.out.println(a+" is present in: "+binarySearch(arr,0,arr.length-1,a)+" position");
    }

}
