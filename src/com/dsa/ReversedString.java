package com.dsa;

import java.util.* ;
import java.io.*;
import java.util.Scanner;

public  class ReversedString{

    static String reverseEachWord(String input)
    {
        String ans="";
        String arr[]=input.split(" ");
        for(String word:arr)
        {
            ans+=rev(word)+" ";
        }
        return ans;
    }
    static public String rev(String word)
    {
        String ans="";
        for(int i=word.length()-1;i>=0;i--)
        {
            char ch=word.charAt(i);
            ans+=ch;

        }
        return ans;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
