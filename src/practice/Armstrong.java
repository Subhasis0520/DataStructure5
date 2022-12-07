package practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int temp = n;
        int res =0;

        while (n>0){
            int last = n%10;
            res =res + (last*last*last);
            n = n/10;
        }
        if (temp == res){
            System.out.println(temp+" is a armstrong number");
        }else {
            System.out.println(temp+" is not a armstrong number");
        }
    }
}
