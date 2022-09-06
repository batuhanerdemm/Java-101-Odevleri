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
                int mat,fizik,tarih,türkçe,müzik;
                //scanner sınıfımız tanımladık
                Scanner inp= new Scanner(System.in);

                //Kullanıcıdan değer al
                System.out.println("Matematik Notunuz:");
                mat=inp.nextInt();
                System.out.println("Fizik Notunuz:");
                fizik=inp.nextInt();
                System.out.println("Tarih Notunuz:");
                tarih=inp.nextInt();
                System.out.println("Müzik Notunuz:");
                müzik=inp.nextInt();
                System.out.println("Türkçe Notunuz:");
                türkçe=inp.nextInt();
                int toplam= (mat+fizik+tarih+müzik+türkçe);
                double sonuc1= toplam/6;

                boolean kosul1 = sonuc1>60;


                String str = kosul1 ? "Geçtiniz" : "Sınıfta kaldınız";
                /*String star = kosul2 ? "Geçtiniz" : "Sınıfta kaldıınız";*/
        System.out.println(str);

            }
        }


