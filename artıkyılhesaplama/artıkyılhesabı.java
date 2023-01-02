package tekrar;

import java.util.Scanner;

public class artıkyılhesabı {
    public static void main(String[] args) {
        int yıl;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        yıl = inp.nextInt();
        if (yıl/4==0){
            System.out.println(yıl+" Artık bir yıldır !");
        } else if (!(yıl/4==0)) {
            System.out.println(yıl+" Artık bir yıl değildir !");
        }

    }
}
