package com.dsa;
import java.util.Scanner;


public class Reverse_String {
    static String reverseStringWordWise(String input) {

        String[] str = input.split(" ");
        String result = "";
        for(int i = str.length-1; i >= 0 ; i--){
            result += str[i]+" ";
        }

        return result;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
