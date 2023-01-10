package tekrar;
import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner inpno =new Scanner(System.in);
        int result=0;
        System.out.println("Sayı giriniz :");
        int a = inpno.nextInt();

           for (int n=1;n<=a;n++) {
               a /= n;
               //İf kısmında takıldım seyma aksu arkadasımızın calısmasından faydalandım.
               if (a/n==0){
               result +=n;
               }
               if (result==a){
               System.out.println(a+"Mükemmel sayıdır.");
           }else System.out.println(a+"Mükemmel sayı değildir");
        }
    }
}

