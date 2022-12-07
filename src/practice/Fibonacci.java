package practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num1 =0;
        int num2 =1;

        for (int i =0;i<n;i++){
            int result= num1+num2;
            System.out.println(num1);
            num1 = num2;
            num2 = result;
        }
        System.out.println(n+"th no number is: "+num1);
    }
}
