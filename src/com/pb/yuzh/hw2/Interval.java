package com.pb.yuzh.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;

        a = scan.nextInt();

        if (a >= 0 && a <= 14) {
            System.out.print("[0 -14]");
        } else if (a >= 15 && a <= 35) {
            System.out.print("[15 - 35]");
        } else if (a >= 36 && a <= 50) {
            System.out.print("[36 - 50]");
        } else if (a >= 51 && a <= 100) {
            System.out.print("[51 - 100]");
        } else {
            System.out.print("Число не попадает в один из имеющихся промежутков");
        }
    }
}
