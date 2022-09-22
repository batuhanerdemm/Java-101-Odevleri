package com.example.nanana;
import java.util.Locale;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        int Türkçe =(0-100), Matematik=(0-100), Fizik=(0-100), Geometri=(0-100);

        Scanner input = new Scanner(System.in);
        System.out.println("Türkçe Notunuzu Giriniz: ");
        Türkçe = input.nextInt();
        while (!(Türkçe>=0 && Türkçe<=100)){
            continue;
        }
        System.out.println("Matematik Notunuzu Giriniz: ");
        Matematik = input.nextInt();
        while (!(Matematik>=0 && Matematik<=100)){
            continue;
        }
            System.out.println("Fizik Notunuzu Giriniz: ");
            Fizik = input.nextInt();
        while (!(Fizik>=0 && Fizik<=100)){
            continue;
        }
        System.out.println("Geometri Notunuzu Giriniz: ");
            Geometri = input.nextInt();
        while (!(Geometri>=0 && Geometri<=100)){
            continue;
        }
            double average = (Türkçe + Matematik + Fizik + Geometri) / 4;
            if (average <= 55) {
                System.out.println("Sınıfa kaldınız, seneye tekrar götüşmek üzere ");

            } else {
                System.out.println("Tebrikler Sınıfı Geçtiniz ");
                System.out.println("Ortalamanız" + average);
            }
        }
    }










