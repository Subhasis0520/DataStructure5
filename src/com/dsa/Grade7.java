package com.dsa;

import java.util.Scanner;

public class Grade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextByte();
        System.out.println("The student is:");
        if (number > 90){
            System.out.println("excellent");
        } else if (80< number && number <=90) {
            System.out.println("Good");
        }  else if (70< number && number <=80) {
            System.out.println("Fair");
        }  else if (60< number && number <=70) {
            System.out.println("Meets expectation");
        }else {
            System.out.println("Below per");
        }

    }
}
