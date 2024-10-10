package K14_whileLoop;

import java.util.Scanner;

public class C02_WhileLoopVsForLoop {

    public static void main(String[] args) {

        // kullaniciya istedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayilar pozitif ise sayiyi toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        // girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 10 ; // 0'in disinda bir deger atamamiz gerekir
                               // cunku kullanici 0'a bastiginda kodun bitmesi isteniyor
                               // biz basta 0 degeri verirsek kod calismaya baslamadan biter
        int toplam = 0;
        int sayac = 0;

        while (  girilenSayi != 0 ){

            System.out.println("Lutfen toplanmak uzere, pozitif bir tamsayi giriniz." +
                                "\nbitirmek icin 0'a basiniz...");

            girilenSayi = scanner.nextInt();

            if (girilenSayi > 0 ){
                toplam += girilenSayi;
                sayac++;
            } else if ( girilenSayi < 0) {
                System.out.println("Negatif sayi kabul edilmez...");
            }

        }

        System.out.println("Girilen " + sayac + " adet pozitif tamsayinin toplami : " + toplam);




    }
}
