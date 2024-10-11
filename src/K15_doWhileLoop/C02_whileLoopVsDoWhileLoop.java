package K15_doWhileLoop;

import java.util.Scanner;

public class C02_whileLoopVsDoWhileLoop {

    public static void main(String[] args) {

        /*
            while loop'un en buyuk eksisi
            kullanicidan deger alinan gorevlerde
            loop calismadan once kod yazan kisinin atayacagi degerin ONEMLI olmasidir

            Cunku kod yazan kisi ilk deger atamasini yanlis yaparsa
            LOOP BODY hic calismayabilir.
         */

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scanner = new Scanner(System.in);

        int sayi=0;
        int sayiToplami = 0;
        int sayac = 0 ;


        // while loop ile yapalim

        while ( sayi != 0 ){

            System.out.println( "Lutfen toplanmak uzere pozitif tamsayi giriniz" +
                                "\nBitirmek icin 0'a basiniz...");

            sayi = scanner.nextInt();

            if ( sayi > 0 ) {
                sayiToplami += sayi ;
                sayac++;
            } else if (sayi < 0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

            System.out.println("Girilen " + sayac + " adet pozitif tamsayinin toplami : " + sayiToplami);

        }

        // aynisini do while ile yapalim

        do {

            System.out.println( "Lutfen toplanmak uzere pozitif tamsayi giriniz" +
                                "\nBitirmek icin 0'a basiniz...");

            sayi = scanner.nextInt();

            if ( sayi > 0 ) {
                sayiToplami += sayi ;
                sayac++;
            } else if (sayi < 0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

        }while (sayi != 0);
        System.out.println("Girilen " + sayac + " adet pozitif tamsayinin toplami : " + sayiToplami);



    }
}
