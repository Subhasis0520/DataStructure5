package star;

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char ch ='a';
        for (int i=1; i<=n;i++){
            //char ch ='a';
            for (int j=1; j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
           //ch++;
            System.out.println();
        }
    }
}
