package com.example.nanana;
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
        // Değişkenleri olustur
        int a, b;
        double c;
        //scanner sınıfımız tanımladık
        Scanner kenar = new Scanner(System.in);
        System.out.println("1.Kenarını Giriniz");
        a = kenar.nextInt();
        System.out.println("2.Kenarını Giriniz");
        b = kenar.nextInt();
       c =Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs"+c);
    }
}

