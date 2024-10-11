package K11_stringManipulations.D04_nullPointer_replace;

import java.util.Scanner;

public class C06_VerilenMetniTemizleme {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan herseyi silin
        // ornek : input  : J1a4v*a )G*&^56uzel_!dir.
        //         output : Java Guzeldir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine(); // J1a4v*a )G*&^56uzel_!dir.

        // rakamlardan kurtulalim
        metin = metin.replaceAll("\\d","");

        // space'i koruma altina almaliyiz
        // yukarda sayilari yok ettigimiz icin
        // metinde sayi olmadigini biliyoruz
        // gecici olarak space yerine herhangi bir sayi yazdiralim, en sonda yeniden space'e ceviririz
        metin= metin.replaceAll(" ","1");


       // w olmayanlardan kurtulalim  ==> harfler, rakamlar ve _
        metin = metin.replaceAll("\\W","");

        // _ icin ozel kod yazmamiz lazim
        metin = metin.replaceAll("_","");

        // space yerine 1 yazmistik, onu eski haline dondurelim
        metin = metin.replaceAll("1"," ");

        metin+= ".";


        System.out.println("Metnin son hali : " + metin); // Metnin son hali : Java Guzeldir.
    }
}
