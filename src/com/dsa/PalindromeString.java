package com.dsa;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int low = 0;
        int high = str.length() - 1;
        int flag = 0;

        while (low < high){
            if (str.charAt(low) != str.charAt(high)){
                flag =1;
                break;
            }
            low++;
            high--;
        }
        if (flag == 0){
            System.out.println(str +" is palindrome");
        }else {
            System.out.println(str +" is not palindrome");
        }
    }
}
