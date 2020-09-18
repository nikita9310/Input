package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.print( " Количество недель =");
         int week = scanner.nextInt();
         System.out.print( "Количество месяцев = ");
         int month = scanner.nextInt();
         System.out.print( "Количество лет = ");
         int year = scanner.nextInt();

         int days = week*7+month*30+year*365;

         System.out.print("Количество дней = " + days);

    }
}
