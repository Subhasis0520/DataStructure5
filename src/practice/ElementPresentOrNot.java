package practice;

import java.util.Scanner;

public class ElementPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number want to check: ");
        int n = sc.nextInt();

        int arr[] ={10,11,12,13,14,51,65,60,44,72};
        boolean flag = false;
        for (int i =0;i<arr.length;i++){
            if (arr[i] == n) {
                flag = true;
            }
        }
        if (flag){
            System.out.println("Element is  present");
        }else {
            System.out.println("Element is not present");
        }
    }
}
