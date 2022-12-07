package com.dsa;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        boolean flag = true;
        for (int i =0; i< t;i++) {
            int n = sc.nextInt();

            for (int j = 2; j < n/2; j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("Prime number");
        }else {
            System.out.println("Not prime number");
        }
    }
}
