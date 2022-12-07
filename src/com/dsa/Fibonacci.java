package com.dsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of series");
        int n = sc.nextInt();

        int fno =0;
        int sno =1;
        for(int i =0; i< n;i++){
            System.out.println(fno);
            int result = fno + sno;
            fno = sno;
            sno = result;

        }
    }
}
