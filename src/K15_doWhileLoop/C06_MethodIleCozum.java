package K15_doWhileLoop;

import java.util.Scanner;

public class C06_MethodIleCozum {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        //         o harfleri ve aralarindaki harfleri yazdirin.
        //         kullanici bir harf harf degil
        //         bir metin girerse uyari verip, yeniden harf girmesini isteyin
        //         kullanici harf girinceye kadar tekrar isteyin

        Scanner scanner = new Scanner(System.in);

        String girilenBaslangic = "";
        String girilenBitis = "";
        boolean degerlerUygunMu = false;

        do {

            System.out.println("Lutfen baslangic icin bir harf giriniz...");
            girilenBaslangic = scanner.nextLine();

            System.out.println("Lutfen bitis icin bir harf giriniz...");
            girilenBitis = scanner.nextLine();

            degerlerUygunMu = girilenDegerlerGecerliMi(girilenBaslangic,girilenBitis);

            if (degerlerUygunMu){
                aradakiHarfleriYazdir(girilenBaslangic,girilenBitis);
            }


        }while( !degerlerUygunMu );


    }

    public static boolean girilenDegerlerGecerliMi( String girilenBaslangic, String girilenBitis ){

        char baslangic = girilenBaslangic.charAt(0);

        char bitis = girilenBitis.charAt(0);

        if (girilenBaslangic.length()>1  || girilenBitis.length() > 1) {
            System.out.println("baslangic ve bitis degeri olarak harf girmelisiniz");
            return false;

        } else if ( !Character.isLetter(baslangic) || !Character.isLetter(bitis) ) { // girilenBaslangic ve girilenBitis tek karakter
            System.out.println("Girdiginiz karakter harf olmalidir");
            return false;
        }  else{
            return true;
        }


    }

    public static void aradakiHarfleriYazdir(String girilenBaslangic, String girilenBitis){

        char baslangic = girilenBaslangic.charAt(0);
        char bitis = girilenBitis.charAt(0);

        while ( baslangic <= bitis){
            System.out.print(baslangic + " ");
            baslangic++;
        }

    }



}
