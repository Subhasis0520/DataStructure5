package com.dsa;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of bulbs ");
        int n = sc.nextInt();

        for (int i =1; i*i <= n; i++){
            System.out.println(i*i);
        }

    }
}
