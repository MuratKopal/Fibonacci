package Donguler;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısını giriniz : ");
        int num = scan.nextInt();
        int a = 0, b = 1, c;

        System.out.print(a + " " + b);
        for (int i = 0; i <= num - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }

    }
}
