package function;

import java.util.Scanner;

public class AnyBase_Decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        System.out.println("Enter the base");
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int ans =0;
        int p =1;

        while (n >0){
            int last = n%10;
            n = n/10;

            ans = ans+(last*p);
            p = p*b;

        }
        return ans;
    }
}
