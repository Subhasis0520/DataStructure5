package function;

import java.util.Scanner;

public class NPR {

    public static int fact(int n){
        int fac = 1;
        for (int i=1;i<=n;i++){
            fac = fac*i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter th value of N: ");
        int n =sc.nextInt();
        System.out.println("Enter th value of R: ");
        int r = sc.nextInt();
        int facn = fact(n);
        int factr = fact(n-r);
        int npr = facn/factr;
        System.out.println(n+"P"+r+" = "+npr);
    }
}
