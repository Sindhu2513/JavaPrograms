package Sindhu.Methods;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n) {

        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
