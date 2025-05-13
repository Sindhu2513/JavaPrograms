package Sindhu.com;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int digit = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;

        }
        if (rev == digit) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a palindrome");

        }

    }
}
