package com.pb.yuzh.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        operand1 = scan.nextInt();
        sign = scan.next();
        operand2 = scan.nextInt();

        switch (sign) {
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ошибка деления на 0");
                } else {
                    System.out.println(operand1/operand2);
                }
                break;

        }

    }
}
