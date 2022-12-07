package com.dsa;
import java.util.*;
public class No_Of_Words {
    static int  countWords(String input) {
        input = input.trim();
        int count = 0;
        for(int i=0; i< input.length(); i++){
            if(input.charAt(i) == ' ' && input.charAt(i-1) != ' '){
                count++;
            }
        }
        return 1+count;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println("No of words are: "+output);

    }
}
