package star;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char value ='a';
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(value+" ");

            }
            value++;
            System.out.println();
        }
    }
}
