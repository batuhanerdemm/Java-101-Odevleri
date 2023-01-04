package tekrar;
import java.util.Scanner;
public class uslusayıhesaplama {
    public static void main(String[] args) {
        int a,b,total=1;
        Scanner uslusayı = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz :");
        a = uslusayı.nextInt();
        System.out.println("Üssü kaç kere alınacaktır ?");
        b = uslusayı.nextInt();
        for (int i =1;i<=b;i++ ){
         total *=a;
        }
        System.out.println("Cevap :" +total);

    }
}
