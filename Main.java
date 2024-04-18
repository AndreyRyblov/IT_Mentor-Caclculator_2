package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {

            int a = scn.nextInt();
            String z = scn.next(); // создал переменную, с помощью которой считываю знак операнда
            int b = scn.nextInt();

            if (z.equals("+")) {
                if (a < 1 || a > 10 || b < 1 || b > 10) {
                    System.out.println("Некорректное значение");
                } else {
                    System.out.print("result = " + (a + b) + "\n");
                }
            }
            if (z.equals("-")) {
                if (a < 1 || a > 10 || b < 1 || b > 10) {
                    System.out.println("Некорректное значение");
                } else {
                    System.out.print("result = " + (a - b) + "\n");
                }
            }
            if (z.equals("*")) {
                if (a < 1 || a > 10 || b < 1 || b > 10) {
                    System.out.println("Некорректное значение");
                } else {
                    System.out.print("result = " + (a * b) + "\n");
                }
            } else if (z.equals("/")) {
                if (a < 1 || a > 10 || b < 1 || b > 10) {
                    System.out.println("Некорректное значение");
                } else {
                    System.out.print("result = " + (a / b) + "\n");
                }
            }

        }
    }
}