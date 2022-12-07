package star;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sp = 2*n-3;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= star; j++) {
                System.out.print(val+ "\t");
                val++;
            }
            for (int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            if (i==n){
                star--;
                val--;
            }
            for (int j = 1; j <= star; j++) {
                val--;
                System.out.print(val+ "\t");
            }
            star++;
            sp-=2;

            System.out.println();
        }
    }
}
