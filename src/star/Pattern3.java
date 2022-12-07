package star;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sp = n-1;
        int star = 1;
        for (int i =1; i<=n; i++){
            for (int j =1; j<=sp; j++){
                System.out.print("\t");
            }
            for (int j=1; j<=star;j++){
                System.out.print("*\t");
            }
            sp--;
            star++;
            System.out.println();
        }
    }
}
