package RecoverDersleri.ders03;

import java.util.Scanner;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // kullanicidan bir cumle alin
        // eger cumle 3 kelimeden fazla ise "cumle cok uzun" yazdirin
        // 3 kelimeye kadar olan cumlelerdeki kelimeleri tersten yazdirin

        // ornek : input ==> Java cok guzel
        //         output ==> guzel cok Java

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();
        // merhaba                                          space sayisi = 0
        // merhaba arkadaslar                               space sayisi = 1
        // merhaba arkadaslar nasilsiniz                    space sayisi = 2
        // Ali okula gitti gelecek.                         space sayisi = 3
        // Ali okula gitti, ne zaman gelir bilmiyorum....   space sayisi > 3

        // space sayilarina bakarak kac kelime olduguna karar verebiliriz

        int ilkSpaceIndexi = cumle.indexOf(" ");
        int ikinciSpaceIndex = cumle.indexOf(" ", ilkSpaceIndexi+1);
        int ucuncuSpaceIndex = cumle.indexOf(" ", ikinciSpaceIndex+1);


        if (ilkSpaceIndexi == -1){
            // kelimeSayisi = 1;

            System.out.println(cumle);

        } else if (ikinciSpaceIndex == -1) {
            // kelimeSayisi = 2;
            // ali gel

            System.out.println( cumle.substring(ilkSpaceIndexi+1 )  + " " + cumle.substring(0,ilkSpaceIndexi));

        } else if (ucuncuSpaceIndex == -1) {
            // kelimeSayisi = 3;
            // Ali topu tut

            System.out.println(
                   cumle.substring(ikinciSpaceIndex+1)+
                   " "+
                   cumle.substring(ilkSpaceIndexi+1 , ikinciSpaceIndex)   +
                   " "+
                   cumle.substring(0,ilkSpaceIndexi)

            );


        } else System.out.println("cumle cok uzun");
















        // merhaba arkadaslar nasilsiniz?
        // cumlede space var mi ?
//        System.out.println(cumle.contains(" ")); // true
//        System.out.println(cumle.startsWith(" ")); // false
//        System.out.println(cumle.startsWith(" ", 7)); // " arkadaslar nasilsiniz?" ==> true
//        System.out.println(cumle.endsWith(" ")); // "?" ==> false
//
//        System.out.println(cumle.indexOf('a')); // 4
//        System.out.println(cumle.indexOf('a', 5)); // 6
//        System.out.println(cumle.indexOf("a", 7)); // 9
//
//        System.out.println(cumle.length()); // 30
//
//        System.out.println(cumle.lastIndexOf('a'));//20
//        System.out.println(cumle.lastIndexOf('a', 19)); // 16
//        System.out.println(cumle.lastIndexOf("a", 15)); // 13
//
//        System.out.println(cumle.indexOf("Java")); // -1
//        System.out.println(cumle.lastIndexOf("Ali")); // -1


    }
}
