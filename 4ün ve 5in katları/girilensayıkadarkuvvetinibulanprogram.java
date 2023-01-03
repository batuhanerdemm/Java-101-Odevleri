package tekrar;
import java.util.Scanner;
public class girilensayıkadarkuvvetinibulanprogram {
    public static void main(String[] args) {
        int sınırsayı,tercih;
        Scanner kuvvet = new Scanner(System.in);
        System.out.println("Sınır sayı giriniz :");
        sınırsayı = kuvvet.nextInt();
        System.out.println("Önce 4 ün katları mı bulunsun yoksa 5 in mi ? ");
        System.out.println("1 derseniz 4 ün katları bulunur 2 derseniz 5 in katları bulunur.");
        tercih = kuvvet.nextInt();
        if (tercih==1) {
            for (int i = 1; i <= sınırsayı; i *= 4) {
                System.out.println(i);
            }
        }
        if (tercih ==2){
            for (int i=1;i<=sınırsayı; i*=5){
                System.out.println(i);
            }
        }

    }
}
