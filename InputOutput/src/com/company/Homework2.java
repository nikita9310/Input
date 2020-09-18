package com.company;

import java.util.Scanner;

public class Homework2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сторона квадрата = ");
        int Storonakvadrata = scanner.nextInt();
        int perimetr = 4*Storonakvadrata;
        System.out.print("Периметр квадрата ="+ perimetr);
        int ploshad = Storonakvadrata*Storonakvadrata;
        System.out.print(" Площадь квадрата = " + ploshad);
    }


}
