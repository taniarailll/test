package com.company;

import java.util.Scanner;

public class Task2 {
    public static void task2() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("введите первое целое число:");
            int num1 = scanner.nextInt();
            System.out.print("введите второе целое число:");
            int num2 = scanner.nextInt();
            int x1 = num1, x2 = num2, y = 0;

            while (x1 != x2) {
                y = Math.abs(x1 - x2);
                x2 = x1;
                x1 = y;

            }
            System.out.println("НОД :" + y);
            System.out.println("НОК:" + num1 * num2 / y);
        }
        catch (Exception e) {
            System.out.println("требуется ввести целое число " + e);
            task2();
        }

    }
}
