package star;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i =1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i == j || i==(n+1-j)){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}
