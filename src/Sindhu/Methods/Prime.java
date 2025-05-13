package Sindhu.Methods;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num) ? "Prime" : "Not Prime");
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(num + " is a prime.");
//        } else {
//            System.out.println(num + " is not a prime.");
//        }

    }
}
