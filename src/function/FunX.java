package function;

import java.util.Scanner;

public class FunX {
    public static int funX2(int x){
        int xSquare = x*x;
        return xSquare;
    }
    public static int funX3(int x){
        int xCube = x*x*x;
        return xCube;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int n = sc.nextInt();
        System.out.println("Square of "+n+" is: "+funX2(n));
        System.out.println("Cube of "+n+" is: "+funX3(n));

    }
}
