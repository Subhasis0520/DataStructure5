package practice;

import java.util.Scanner;

public class PositionOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number want to check: ");
        int n = sc.nextInt();

        int arr[] ={10,11,12,13,14,51,65,60,44,72};

        for (int i =0;i<arr.length;i++){
            if (arr[i] == n) {
                System.out.println("Element is present on " + i +" position");
                break;
            }else {
                System.out.println("Element is not present ");
                break;
            }
            }


        }
        }


