package com.company;

import java.util.Scanner;

public class SpeedMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите расстояние (км): ");
        int s = scanner.nextInt();

        System.out.print("Введите время (ч): ");
        int t = scanner.nextInt();

        s = s * 1000;
        t = t * 3600;

        double v = (double) s / t;
        System.out.println("Скорость = " + v);
    }


}
