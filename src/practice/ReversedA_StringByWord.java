package practice;

import java.util.Scanner;

public class ReversedA_StringByWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        String a[] = str.split(" ");
        for (int i = a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

    }
}
