package practice;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        int vcount =0;
        int cncount =0;

        System.out.println("vowels are: ");
        for (int i =0;i<str.length();i++){
           char x = str.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                System.out.print(str.charAt(i)+" ");
                vcount++;
            }
        }
        System.out.println();
        System.out.println("consonant are: ");
        for (int i =0;i<str.length();i++){
            char x = str.charAt(i);
            if(x!='a' && x!='e' &&  x!='i' &&  x!='o' && x!='u'){
                System.out.print(str.charAt(i)+" ");
                cncount++;
            }
        }
        System.out.println();
        System.out.println("total vowels are: "+vcount);
        System.out.println("total consonant are: "+cncount);
    }
}
