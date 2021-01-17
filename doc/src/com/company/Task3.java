package com.company;

import javafx.scene.effect.Light;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void task3() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предложение :");
        String str = scanner.nextLine();

        String[] substr = str.split(" ");
        String[] substr2 = str.split(" ");
        System.out.println("количество слов в предложении: "+ substr.length);

        System.out.println("отсортированные слова по алфавиту: ");
        Arrays.sort(substr);
        for (int i = 0; i < substr.length; i++) {
            System.out.println(substr[i]);
        }
        System.out.println("каждое слово с заглавной буквы: ");
        for (int i = 0; i < substr.length; i++) {
            substr2[i] = substr2[i].substring(0,1).toUpperCase() + substr2[i].substring(1);
            System.out.print(substr2[i]+" ");
        }

    }
}
