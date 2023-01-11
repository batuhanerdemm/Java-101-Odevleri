package tekrar;
import java.util.Scanner;
public class armstrongwhile {


    class ArmstrongNumber
    {
        public static void main(String args[])
        {
            int n, sum = 0, t, remainder, digits = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Armstrong sayısı olup olmadığı kontrol edilecek sayıyı girin");
            n = in.nextInt();

            t = n;
            // Basamak sayısını kontrol ediyoruz

            while (t != 0) {
                digits++;
                t = t/10;
            }

            t = n;

            while (t != 0) {
                remainder = t%10;
                sum = sum + power(remainder, digits);
                t = t/10;
            }

            if (n == sum)
                System.out.println(n + " Armstrong sayısı.");
            else
                System.out.println(n + " Armstrong sayısı değil.");
        }

        static int power(int n, int r) {
            int c, p = 1;

            for (c = 1; c <= r; c++)
                p = p*n;

            return p;
        }
    }
}
