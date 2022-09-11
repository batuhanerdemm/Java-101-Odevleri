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
        int  n1,n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        n1= input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        n2= input.nextInt();
        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
        System.out.print("Seçiminiz:");
        select = input.nextInt();
        switch (select){
            case 1:
            System.out.println("Toplam :" +(n1+n2));
            break;
            case 2:
            System.out.println("Çıkarma :" +(n1-n2));
            break;
            case 3:
                System.out.println( "Çarpma :" +(n1 * n2));
            break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı sıfıra bolunemez !!");
                        break;
                    default:System.out.println("Bolme = "+ (n1 / n2));}
                 break;
            default:
                System.out.println("Hiçbir sayı sıfıra bölünemez");

        }

    }

}




