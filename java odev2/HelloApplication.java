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
             

                //Kullanıcıdan değer al
        System.out.println("Tutar Giriniz:");
        mat=inp.nextInt();
        double tutar= mat;
        if (mat>1000){
            System.out.println(tutar + tutar * 0.18);
            System.out.println(tutar * 0.18);
        }
        else if (mat<1000){
            System.out.println(tutar + tutar * 0.08);
            System.out.println(tutar * 0.08);

              }

            }
        }


