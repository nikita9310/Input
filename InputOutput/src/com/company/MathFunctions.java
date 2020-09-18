package com.company;

import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, stepen;
        System.out.print("Введите число: ");
        num = scanner.nextInt();

        System.out.print("Введите степень: ");
        stepen = scanner.nextInt();

        int res = (int) Math.pow(num, stepen);
        System.out.println(res);

        double res2 = Math.sqrt(res);
        System.out.println(res2);
    }
}
