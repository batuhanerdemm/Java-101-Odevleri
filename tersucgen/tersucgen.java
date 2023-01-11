package tekrar;
import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        int a,j,k;//Değişekenlerimizi tanımladık.
        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz :");
        a= inp.nextInt();
        for (int i =0; i<a; a--) {//Döngümüzün ne kadar döneceğini belirtir.
            for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k=1; k<=a; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }

        }
    }

