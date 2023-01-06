package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months;
        double money;
        double interestRate;


        System.out.print("Nhap vao so tien gui:");
        money = scanner.nextDouble();

        System.out.print("Nhap vao so thang gui:");
        months= scanner.nextInt();

        System.out.print("Nhap vao ti le lai:");
        interestRate = scanner.nextDouble();

        double count = 0;
        for(int i = 0; i < months; i++){
            count += money * (interestRate/100)/12 * months;
        }

        System.out.println("Tong so tien lai la: " + count);
    }
}