package com.dsa;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position");
        int k = sc.nextInt();

        int noOgDigit =0;
        int temp =n;
        while (temp>0){
            temp = temp/10;
            noOgDigit++;
        }

        k = k % noOgDigit;
        if (k<0){
            k = k + noOgDigit;
        }

        int div = 1;
        int multi = 1;
        for (int i = 1; i<= noOgDigit; i++){
            if (i <= k){
                div = div*10;
            }else {
                multi = multi*10;
            }
        }

        int q = n/div;
        int r = n%div;

        int ans = r*multi + q;
        System.out.println(ans);
    }
}
