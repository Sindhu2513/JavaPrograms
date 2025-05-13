package Sindhu.Methods;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
        if(n<=1)return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(factorial(n));

    }
}
