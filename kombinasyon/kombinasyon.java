package tekrar;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
     int sayı1,sayı2,total =1;
        Scanner kombinasyon =new Scanner(System.in);
        System.out.println("Kombinasyonu alınmmak istenen sayıyı giriniz :");
        sayı1 = kombinasyon.nextInt();
        System.out.println("Kombinasyon sayısını giriniz ");
        sayı2 = kombinasyon.nextInt();
        for (int i=sayı1;i>sayı2; i--){
            total*=i;
        }
        System.out.println("Sonuç"+total);
    }
}
