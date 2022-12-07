package practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        String ans ="";
        for (int i = str.length()-1;i>=0;i--){
            ans =ans+str.charAt(i);
        }
        if (str.equalsIgnoreCase(ans)){
            System.out.println("It is palindrome");
        }else {
            System.out.println("It is not palindrome");
        }
    }
}
