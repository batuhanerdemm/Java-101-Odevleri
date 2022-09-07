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
        // Değişkenleri olusturup tanımladık
        int r;
        double pisayisi=3.14,cemberalani,cembercevresi,dairedilimi=30,dairedilimialanı;
        //scanner sınıfımız tanımladık
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz");
        r = input.nextInt();
        cemberalani = (pisayisi*(r*r));
        System.out.println("Çember Alanı:"+cemberalani);
        cembercevresi = (2*(pisayisi*r));
        System.out.println("Çember Çevresi:"+cembercevresi);
        dairedilimialanı =(pisayisi*(r*r)*dairedilimi)/360;
        System.out.println("Daire Dilimi Alanı:"+dairedilimialanı);

    }
}

