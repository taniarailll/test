package com.company;

import java.util.Scanner;

public class Task4 {
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предложение :");
        String str = scanner.nextLine();
        System.out.println("введите слово для поиска в тексте :");
        String word = scanner.nextLine();
        int counter = 0;

        String[] substr = str.split(" ");
        for (int i = 0; i < substr.length; i++) {
            if (substr[i].equalsIgnoreCase(word)) {
                counter++;
            }
        }
        System.out.println("количество слов" + counter);
    }

}
