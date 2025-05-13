package Sindhu.Methods;

import java.util.Scanner;

public class LCM {
    static int lcm(int a, int b) {
        while (a % b == 0) {
            a = a / b;
            b = b / 2;
//            a /= b;
//            b /= 2;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("LCM of: "+ a +" and "+ b + " is " + lcm(a, b));

    }
}
