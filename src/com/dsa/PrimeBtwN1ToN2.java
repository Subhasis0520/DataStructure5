package com.dsa;

import java.util.Scanner;

public class PrimeBtwN1ToN2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number where to start");
    int n1 = sc.nextInt();
        System.out.println("Enter number where to stop");
    int n2 = sc.nextInt();

    for (int i =n1; i<= n2;i++){
        int count =0;
        for (int j =2; j*j<= i; j++) {
            if (i % j == 0) {
              count++;
              break;
            }
        }
            if (count == 0){
                System.out.println(i);
            }

    }

    }
}