package star;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a =0;
        int b =1;
        int c = a+b;
        for (int i =1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a +"\t");
                a=b;
                b=c;
                c=a+b;
            }
            System.out.println();
        }
    }
}
