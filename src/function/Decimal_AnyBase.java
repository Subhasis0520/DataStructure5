package function;

import java.util.Scanner;

public class Decimal_AnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = scn.nextInt();
        System.out.println("Enter the base");
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int ans =0;
        int p =1;

        while (n >0){
            int last = n%b;
            n = n/b;

            ans = ans+ last*p;
            p = p*10;
        }

        return ans;
    }
}
