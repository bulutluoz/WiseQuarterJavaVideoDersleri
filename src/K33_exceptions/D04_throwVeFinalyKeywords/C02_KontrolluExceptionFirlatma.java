package K33_exceptions.D04_throwVeFinalyKeywords;

import java.util.Scanner;

public class C02_KontrolluExceptionFirlatma {

    public static void main(String[] args) {

        // Kod'un herhangi bir satirinda kontrollu olarak exception firlatilabilir
        // Kontrollu bir sekilde baska bir bolume gecis veya
        // kullaniciya istenen mesaji iletme olabilir

        // kullanicidan yasini, cinsiyetini ve uyrugunu isteyin
        // Yasi 60 ve 75 arasi olan (sinirlar dahil)
        // cinsiyeti E veya K
        // uyrugu TC olanlar emekli olabilirler.

        // bilgileri alirken bir bilgi istenmeyen sekilde ise
        // hemen emekli olamazsin yazdirsin, diger bilgileri istemesin


        Scanner scanner = new Scanner(System.in);


        try {

            System.out.println("Lutfen yasinizi giriniz");
            int yas = scanner.nextInt();

            if ( yas<60 || yas>75){
                throw new IllegalArgumentException("Yas uygun degil");
            }

            scanner.nextLine();
            System.out.println("Lutfen cinsiyetinizi giriniz. K : Kadin, E : Erkek");
            String cinsiyet = scanner.nextLine();

            if (  ! (cinsiyet.equalsIgnoreCase("k") || cinsiyet.equalsIgnoreCase("e") ) ){
                throw new IllegalArgumentException("Cinsiyet belirlenen degerlerde degil");
            }


            System.out.println("Lutfen uyrugunuzu giriniz...");
            String uyruk = scanner.nextLine();

            if (!uyruk.equalsIgnoreCase("TC")){
                throw  new IllegalArgumentException("Uyruk uygun degil");
            }


            System.out.println("Emekli olabilirsiniz");

        }catch (Exception e){

            if (e.getMessage()==null){
                System.out.println("Yanlis giris");
            } else System.out.println(e.getMessage());


            System.out.println("Emekli olamazsiniz");
        }







    }
}
