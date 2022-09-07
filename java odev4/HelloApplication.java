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
        int baslangicucreti =10 ,Minodenecektutar =20;
        double kmbasinaücret=2.2,mesafe1,toplamücret;
        //scanner sınıfımız tanımladık
        Scanner mesafe = new Scanner(System.in);
        System.out.println("Mesafe giriniz");
        mesafe1 = mesafe.nextInt();
        toplamücret=baslangicucreti+Minodenecektutar+mesafe1*kmbasinaücret;
        System.out.println("Toplam Ücret :"+toplamücret);
    }
}

