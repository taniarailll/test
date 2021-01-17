package com.company;

import java.util.Scanner;

public class Task6 {
    public static void task6() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите вместимость рюкзака:");
            int capacity = scanner.nextInt();
            if (capacity <= 0) {
                System.out.println("вместимость рюкзака не может быть меньше или равным 0");
                task6();
            } else {
                Things fishingRod = new Things("удочка", 8, 20);
                fishingRod.getInfo(fishingRod);
                Things book = new Things("книга", 4, 7);
                book.getInfo(book);
                Things apple = new Things("яблоко", 1, 3);
                apple.getInfo(apple);
                Bag bag = new Bag(capacity);
                bag.calculation(fishingRod, book, apple, capacity);
            }
        }catch (Exception e) {
            System.out.println("требуется ввести целое число " + e);
            task6();
        }
    }
}

class Things {
    private String name;
    private int weight;
    private int price;

    public Things(String name, int weight, int price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void getInfo(Things things) {
        System.out.println("предмет: " + things.getName() + " ,ценность предмета: " + things.getPrice() + " ,вес предмета: " + things.getWeight());
    }
}

class Bag {
    private int capacity;

    public Bag(int capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void calculation(Things fishingRod, Things book, Things apple, int capacity) {
        Things[] arrayOfThings = new Things[3];
        arrayOfThings[0] = fishingRod;
        arrayOfThings[1] = book;
        arrayOfThings[2] = apple;

        System.out.println("вещи в рюкзаке:");
        for (int i = 0; i < arrayOfThings.length; i++) {
            int quantity = capacity / arrayOfThings[i].getWeight();
            if (quantity != 0) {
                System.out.println("предмет: '" + arrayOfThings[i].getName() + "'; количество: " + quantity + " суммарная стоимость: " + quantity * arrayOfThings[i].getPrice() +
                        "; общий вес: " + quantity * arrayOfThings[i].getWeight());
            }
            if (capacity - (quantity * arrayOfThings[i].getWeight()) <= 0) {
                break;
            } else {
                capacity -= quantity * arrayOfThings[i].getWeight();
            }
        }
        System.out.println();

    }

}
