package tekrar;
import java.util.Scanner;
public class ebobekokwhileversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N1 Sayısını giriniz:");
        int n1 = input.nextInt();
        System.out.println("N2 Saysını giriniz");
        int n2 = input.nextInt();
        int  ebob = 1;

                while(n1 != n2)
                {
                    if(n1 > n2)
                        n1 -= n2;
                    else
                        n2 -= n1;
                }

                System.out.println("EBOB = " + n1);

         int ekok = (n1 * n2) / ebob;
        System.out.println("Ekoku :"+ ekok);



        }
    }

