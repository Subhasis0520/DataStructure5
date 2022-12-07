package star;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int x =scn.nextInt();

        for (int i =1; i<=10;i++){
            int value = x*i;
            System.out.println(x +" * " +i+" = "+value);
        }
    }
}
