package com.dsa;

 import java.util.* ;
import java.io.*;
import java.util.Scanner;

public class Remove_CharFrom_String {

        static String removeAllOccurrencesOfChar(String input, char c) {
            String str = " ";
            for(int i=0;i<input.length();i++){
                if(input.charAt(i) == c){

                }else {
                    str = str + input.charAt(i);
                }
            }
            return str;


//            other solution i
            /*

         String [] str=input.split(String.valueOf(c));
           String result="";
           for(int i=0;i<str.length;i++){
              result+=str[i];
           }
           return result;
             */
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            char c = sc.next().charAt(0);
            String ans = removeAllOccurrencesOfChar(input, c);
            System.out.println(ans);
        }
    }
