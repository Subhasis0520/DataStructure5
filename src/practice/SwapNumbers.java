package practice;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
    int a = sc.nextInt();
        System.out.println("enter the 2nd number");
    int b = sc.nextInt();

    int temp = a;
    a=b;
    b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
