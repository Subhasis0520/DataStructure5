package function;

import java.util.Scanner;

public class AnyBase_AnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        System.out.println("Enter the base of the number");
        int sourceBase = scn.nextInt();
        System.out.println("Enter the base to convert");
        int  destBase= scn.nextInt();
//        int d = convert(n,sourceBase,destBase);
        int dec = anyToDecimal(n,sourceBase);
        int d = decimalToAny(dec,destBase);
        System.out.println(d);
    }

    public static int anyToDecimal(int n, int b){
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

    public static int decimalToAny(int n, int b){
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
