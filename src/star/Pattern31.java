package star;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sp = 0;
        int star =n;

        for (int i=1;i<=n;i++){
            for (int j =1; j<=sp;j++){
                System.out.print("\t");
            }for (int j =1; j<=star;j++){
                System.out.print("*\t");
            }
            if(i<= n/2) {
                sp++;
                star -= 2;
            }else {
                sp--;
                star += 2;
            }
            System.out.println();
        }
    }
}
