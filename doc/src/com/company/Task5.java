package com.company;

import java.util.Scanner;

public class Task5 {
    public static void task5() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите длинну последовательности целым числом ,больше 0 и меньше 100 :");
            int lngth = scanner.nextInt();
            if (lngth > 100 || lngth < 1) {
                System.out.println("Некорректный ввод!");
                task5();
            } else {
                int x, y;
                System.out.println("числа-палиндромы в от 0 до " + lngth + " : ");
                for (int i = 0; i <= lngth; i++) {
                    if (i / 10 == i % 10 || i < 10) {
                        System.out.println(i + " ");
                    }

                }
            }
        }catch (Exception e) {
            System.out.println("требуется ввести целое число " + e);
            task5();
        }
    }
}
