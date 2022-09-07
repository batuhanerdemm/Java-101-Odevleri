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
        // Değişkenleri olusturup tanımladık
        double boy,VücutKitleEndeksi;
        int kilo;

        //scanner sınıfımız tanımladık
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        boy = input.nextInt();
        boy /= 100;
        System.out.println("Lütfen kilonuzu giriniz");
        kilo = input.nextInt();
        VücutKitleEndeksi = kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz:"+VücutKitleEndeksi);

    }
}

