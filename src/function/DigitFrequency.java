package function;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        System.out.println("Enter the digit");
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println("Frequency of digit is: "+f);
    }

    public static int getDigitFrequency(int n, int d) {
           int count =0;
           while (n>0){
               int digit = n%10;
               n = n/10;
               if (d == digit){
                   count++;
               }
           }
           return count;
    }

}
