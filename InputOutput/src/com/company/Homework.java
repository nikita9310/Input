package com.company;

import java.util.Scanner;

public class Homework {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество монет по 50 копеек = ");
        int Fiftykop = scanner.nextInt();
        System.out.print("Количество монет по 10 копеек = ");
        int Tenkop = scanner.nextInt();
        System.out.print("Количество монет по 5 копеек = ");
        int Fivekop = scanner.nextInt();
        System.out.print("Количество монет по 1 копейке = ");
        int Onekop = scanner.nextInt();

        int moneytotal = Fiftykop*50 + Tenkop*10 + Fivekop*5 + Onekop;
        System.out.print("Итог= " + moneytotal + " р. ");


    }
}
