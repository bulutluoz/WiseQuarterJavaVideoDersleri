package K12_ForLoop.Ders01_ForLoop;

import java.util.Scanner;

public class C06_RakamlarToplami {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = (girilenSayi+ "").length(); //  1453 + "" ==> "1453".length() ==> 4
        int toplam = 0;
        int sayi = girilenSayi;


        for (int i = 1; i <=basamakSayisi ; i++) {

            toplam += sayi % 10 ;
            sayi /= 10;

        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami :  " +toplam);





    }


}








