package practice;

import javax.swing.event.MenuKeyListener;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int temp = n;
        int res =0;
        while (n >0){
           int last = n%10;
           n = n/10;
            res = (res*10)+last;
        }
        if (temp == res){
            System.out.println(temp+ " is a palindrome number");
        }
        else {
            System.out.println(temp+ " is not a palindrome number");
        }
    }
    }
