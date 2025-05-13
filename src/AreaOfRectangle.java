package Sindhu.com;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = sc.nextInt();
        int area = width * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
