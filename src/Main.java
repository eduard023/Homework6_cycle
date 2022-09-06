public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        //Задание 1
        System.out.println("Задача 1. Домашнее задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        //Задание 1
        System.out.println("Задача 2. Домашнее заадние 1");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

    }

    private static void task3() {
        //Задание 1
        System.out.println("Задача 3. Домашнее задание 1");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Четные числа " + i);
        }
    }

    private static void task4() {
        //Задание 1
        System.out.println("Задача 4. Домашнее задание 1");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

    }

    private static void task5() {
        //Задание 2
        System.out.println("Задача 1. Домашнее задание 2");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год являеться високосным");
        }

    }

    private static void task6() {
        //Задание 2
        System.out.println("Задача 2. Домашнее задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

    }

    private static void task7() {
        //Задание 2
        System.out.println("Задача 3. Домашнее задание 2");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    private static void task8() {
        //Задание 3
        System.out.println("Задача 1. Домашнее задание 3");
        int money = 29_000;
        int saveMoney = 0;
        for (int i = 1; i <= 12; i++) {
            saveMoney = money + saveMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + saveMoney);
        }

    }

    private static void task9() {
        //Задание 3
        System.out.println("Задача 2. Домашнее задание 3");
        int money = 29_000;
        int saveMoney = 0;
        for (int i = 1; i <= 12; i++) {
            saveMoney = saveMoney + saveMoney/100;
            saveMoney = saveMoney + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + saveMoney);
        }
    }
}