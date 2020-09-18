package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кол-во денег у Пети = ");
        int moneyPetya = scanner.nextInt();
        System.out.print("Кол-во денег у Васи = ");
        int moneyVasya = scanner.nextInt();

        int moneyTotal = moneyPetya + moneyVasya;
        System.out.println("Итого = " + moneyTotal + " р.");
    }
}
