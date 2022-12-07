package com.dsa;
import java.util.*;

public class Sub_String {
    static void printSubstrings(String input) {

        int n=input.length();
        for(int i=0;i<n;i++)
        {

            String str="";
            for(int j=i;j<n;j++)
            {
                str+=input.charAt(j);
                System.out.println(str);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
    }
}
