package K10_switchStatements;

import java.util.Scanner;

public class C02_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        /*
            EGER birden fazla case icin ayni islem yapilacaksa
            break her case'de yazilmaz,
            ayni islevi yapan case'ler bir tek break ile birlestirilebilir.
            */

        // kullanicidan gun ismini alin
        // buyuk kucuk harf farketmez
        // girilen gunun hafta ici veya haftasonu oldugunu yazdirin
        // kullanici gun ismini yanlis yazarsa uyarin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi = scanner.nextLine().toLowerCase();

        // Pazar  , PAZAR, pazar, PAzar, PaZaR ==> pazar

        switch ( gunIsmi ){

            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis...");
        }


        boolean emekliMi = true;
        long sayiLong = 45;
        float sayiFloat = 46.8F;
        double sayiDouble = 57;
        char chr = 'y';
        short sayiShort = 90;


        switch (chr){

        }

        /*
            bir switch statement'da switch olarak kullanabilecegimiz variable'in data turu

            byte, short, int, char, String  OLABILIR
            boolean, long, float, double OLAMAZ


         */
    }
}
