package com.dsa;

import java.util.Scanner;

public class InverseNumber_PositionWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        int res = 0;
        int orp = 1;

        while (n !=0){
            int ord = n % 10;
            int inp = ord;
            int ind = orp;

//             now inverse the number
            res = (int) (res + ind*Math.pow(10,inp-1));
            n = n/10;
            orp++;
        }
        System.out.println(res);
    }
}
