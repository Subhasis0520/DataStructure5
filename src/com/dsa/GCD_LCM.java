package com.dsa;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter the 1st number");
        int n2 = sc.nextInt();
        int temp1 = n1;
        int temp2 = n2;


        while (n1%n2 !=0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (temp1 * temp2)/gcd;
        System.out.println("Gcd is: " +gcd);
        System.out.println("Lcm is: " +lcm);
    }
}
