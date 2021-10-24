package com.pb.yuzh.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Отгадайте целое число от 0 до 100");
        System.out.println("Для выхода из программы введите - 111.");

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(101);
        int attempt = 0;

        while (true) {
            attempt++;
            int value = scan.nextInt();

            if (value == 111) {
                break;

            }

            if (value > (number)) {
                System.out.println("Задуманное число меньше вводимого");
                continue;
            }

            if (value < (number)) {
                System.out.println("Задуманное число больше вводимого");
                continue;
            }

            if (value == (number)) {
                System.out.println("Поздравляем, Вы отгадали с " + attempt + " попытки!");
                break;
            }

        }

        System.out.println("Конец игры!");
    }

}
