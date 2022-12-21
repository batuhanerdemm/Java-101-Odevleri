package com.example.nanana;
import java.util.Scanner;

public class whıle {
    public static void main(String[] args) {
        int b;
        int a = 1;
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        b = giris.nextInt();
        while (a<=b){
            a++;
            if (a % 2 ==0){
                System.out.println(a);
            }

        }
    }
}
