package com.dsa;

import java.util.Scanner;

public class MaximumWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        int max =0;
        char result = 'a';
        int count[] = new  int[26];

        for (int i =0; i< str.length();i++){
            count[str.charAt(i) - 'a']++;
        }

        for (int i =0; i< 26;i++){
            if (count[i] > max){
                max = count[i];
                result = (char) ('a' + i);
            }
        }
        System.out.println(max);
    }
}
