package com.pb.yuzh.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Сумма элементов " + sum);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count = count + 1;
        }
        System.out.println("Количество положительных элементов " + count);

        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
