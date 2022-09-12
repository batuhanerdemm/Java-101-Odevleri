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
        String UserName,password,yenisifre,karar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız :");
        UserName = inp.nextLine();
        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if (UserName.equals("Patika")){
            System.out.println("Giris yaptınız");

        } else {
            Scanner a = new Scanner(System.in);
            System.out.println("Bilgileriniz yanlış");
            System.out.print("Şifrenizi sıfırlamak istermisiniz ? ");
            karar = a.nextLine();
            if (karar.equals("Evet")){
                System.out.println("Yeni şifrenizi giriniz :");
                yenisifre = a.nextLine();
                if (yenisifre.equals("Patika")){
                    System.out.println("Eski şifre ile Yeni şifre aynı olamaz.");
                }
                else{
                    System.out.println("Şifre Oluşturuldu.");
                }
            }
        }
    }

    }






