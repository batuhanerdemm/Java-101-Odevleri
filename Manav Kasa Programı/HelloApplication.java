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
        int armutkilo,elmakilo,domateskilo,muzkilo,patlıcankilo;
        double patlıcan =5 , muz = 0.95,domates=1.11,elma=3.67,armut=2.14,toplamtutar;

        //scanner sınıfımız tanımladık
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?");
        armutkilo = input.nextInt();
        armut *=armutkilo;
        System.out.println("Elma Kaç Kilo ?");
        elmakilo = input.nextInt();
        elma *=elmakilo;
        System.out.println("Domates Kaç Kilo ?");
        domateskilo = input.nextInt();
        domates *= domateskilo;
        System.out.println("Muz Kaç Kilo ?");
        muzkilo = input.nextInt();
        muz *= muzkilo;
        System.out.println("Patlıcan Kaç Kilo ?");
        patlıcankilo = input.nextInt();
        patlıcan *=patlıcankilo;
       toplamtutar= (patlıcan+muz+domates+elma+armut);
       System.out.println("Toplam Tutar:"+toplamtutar);

    }
}

