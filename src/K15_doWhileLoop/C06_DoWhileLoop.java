package K15_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        //         o harfleri ve aralarindaki harfleri yazdirin.
        //         kullanici bir harf harf degil
        //         bir metin girerse uyari verip, yeniden harf girmesini isteyin
        //         kullanici harf girinceye kadar tekrar isteyin

        Scanner scanner = new Scanner(System.in);

        char baslangic = 'a';
        char bitis = 's';
        String girilenBaslangic = "";
        String girilenBitis = "";

        do {

            System.out.println("Lutfen baslangic icin bir harf giriniz...");
            girilenBaslangic = scanner.nextLine();
            baslangic = girilenBaslangic.charAt(0);

            System.out.println("Lutfen bitis icin bir harf giriniz...");
            girilenBitis = scanner.nextLine();
            bitis = girilenBitis.charAt(0);

            if (girilenBaslangic.length()>1  || girilenBitis.length() > 1) {
                System.out.println("baslangic ve bitis degeri olarak harf girmelisiniz");

            } else if ( !Character.isLetter(baslangic) || !Character.isLetter(bitis) ) { // girilenBaslangic ve girilenBitis tek karakter
                System.out.println("Girdiginiz karakter harf olmalidir");

            } else { // kullanici tek karkater girdi ve girilen karkter de harf

                 while ( baslangic <= bitis){
                     System.out.print(baslangic + " ");
                     baslangic++;
                 }
            }


        }while( girilenBaslangic.length()>1 ||  girilenBitis.length() > 1 ||  !Character.isLetter(baslangic)  ||  !Character.isLetter(bitis)               );




    }
}
