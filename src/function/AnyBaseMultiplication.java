package function;

import java.util.Scanner;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base");
        int b = scn.nextInt();
        System.out.println("Enter the num1");
        int n1 = scn.nextInt();
        System.out.println("Enter the num2");
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2){
        int ans =0;
        int p =1;
        while (n2> 0){
            int d2 = n2 %10;
            n2 = n2/10;

            int pcd1 = getProductOf1(b,n1,d2);
             ans = getSum(b,ans,pcd1*p);
             p = p*10;

        }

        return ans;
    }

    public static int getProductOf1(int b, int n1, int d2){
        int ans =0;
        int c=0;
        int p =1;

        while (n1>0 || c>0){
            int d1 = n1%10;
            n1 = n1/10;

            int d = d1 * d2 + c;
            c = d/b;
            d = d % b;

            ans = ans+( d*p);
            p = p*10;
        }
        return ans;
    }

    public static int getSum(int b, int n1, int n2){
        int ans =0;
        int p =1;
        int c =0;

        while (n1>0 || n2>0 || c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;

            int d = d1+d2+c;
            c = d/b;
            d = d%b;

            ans = ans+(d*p);
            p = p*10;
        }

        return ans;
    }
}
