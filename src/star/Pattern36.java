package star;

import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        char ch ='A';
        for (int i=1;i<=n;i++){
            for (int j =n; j>i;j--){
                System.out.print(ch);
            }
            for (int k =1;k<=i;k++){
                System.out.print( (char) (ch+i-1));
            }

            System.out.println();
        }
    }
}
