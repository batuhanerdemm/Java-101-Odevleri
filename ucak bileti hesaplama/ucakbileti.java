package tekrar;

import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        int yas;
        double mesafe ,mesafebasınaücret=0.10;
        String yolculuktipi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafe giriniz :");
        mesafe = inp.nextDouble();
        if (mesafe<=0){
            System.out.println("lÜTFEN POZİTİF BİR SAYI GİRİNİZ HATALI VERİ GİRİDİNİZ");
        }
        double tutar= mesafe *mesafebasınaücret;
        System.out.println("Yasınızı giriniz :");
        yas = inp.nextInt();

        System.out.println("Yolculuk tipinizi giriniz :");
        yolculuktipi =inp.nextLine();
        if (yolculuktipi =="1"){
            System.out.println("Tek dönüş sectiniz indirim yok");
        } else if (yolculuktipi=="2") {
            System.out.println(" Yüzde 20 İndirim kazandınız İndirimli tutar"+((tutar -(tutar*0.20))));
        }
        if ((yas<12)){
            System.out.println("Yüzde 50 indirim kazandın"+tutar/2);
        }else if((yas>=12&&yas<=24)){
            System.out.println("Yüzde 10 indirim kazandın "+ (tutar -(tutar * 0.10)));
        }
        else if (yas>65){
            System.out.println("Yüzde 30 indirim kazandınız"+(tutar -(tutar * 0.30)));
        }
        System.out.println(tutar);

    }
}
