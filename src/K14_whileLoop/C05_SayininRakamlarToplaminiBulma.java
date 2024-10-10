package K14_whileLoop;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz..");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int rakamlarToplami = 0 ;


        while ( sayi > 0 ){

            rakamlarToplami += sayi % 10;
            sayi /= 10;

        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}
