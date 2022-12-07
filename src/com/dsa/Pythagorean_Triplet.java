package com.dsa;

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nub: ");
        int a = sc.nextInt();
        System.out.println("Enter the nub: ");
        int b = sc.nextInt();
        System.out.println("Enter the nub: ");
        int c = sc.nextInt();

        if ((a*a)+(b*b) == (c*c) || (a*a)+(c*c) == (b*b) || (c*c)+(b*b) == (a*a)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
