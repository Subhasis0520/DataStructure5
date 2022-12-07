package star;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i==j || j==1) {
                    System.out.print("*\t");
                }else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }
}
