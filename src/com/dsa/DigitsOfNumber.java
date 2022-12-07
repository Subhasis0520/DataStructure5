package com.dsa;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x =0;
        while (n >0){
            x = n%10;
            System.out.println(x);

        }

    }
}
