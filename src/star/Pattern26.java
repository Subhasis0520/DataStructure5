package star;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char value ='a';
        for (int i=1; i<=n;i++){
            for (int j=0; j<=n-i;j++){
                System.out.print((char) (value+j)+" ");
            }
            System.out.println();
        }
    }
}
