package com.company;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        try
        {
            System.out.println("введите целое число:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("число четное");
            } else {
                System.out.println("нечетное число");
            }
            boolean check = true;
            for (int i = 2; i < Math.round(Math.sqrt(num)); i++) {
                if (num % i == 0) {
                    System.out.println("составное:");
                    check = false;
                    break;
                }

            }
            if (check == true) {
                System.out.println("простое");
            }
        }
        catch (Exception e) {
            System.out.println("требуется ввести целое число " + e);
            task1();
        }
    }
}
