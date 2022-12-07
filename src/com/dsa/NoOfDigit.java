package com.dsa;

import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

       int nod =0;
       int temp = n;
       while (temp != 0){
           temp = temp/10;
           nod++;
       }

       int div = (int) Math.pow(10,nod-1);
       while (div != 0){
           int ans = n / div;
           System.out.println(ans);
            n = n % div;
           div =div/10;
       }
    }
}
