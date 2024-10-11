package K11_stringManipulations.D04_nullPointer_replace;

import java.util.Scanner;

public class C07_BilgileriDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen isim-soyisim : C** D****,
        // Kredi kart numarasi  : **** **** **** 4567


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen 16 hane olarak kredi karti numaranizi giriniz...");
        String kkNo = scanner.nextLine();

        System.out.println(

                "Girilen isim-soyisim : " +
                 isim.substring(0,1).toUpperCase()+
                 isim.substring(1).replaceAll("\\w","*")+
                 " "+
                 soyisim.substring(0,1).toUpperCase()+
                 soyisim.substring(1).replaceAll("\\w","*")+
                 ",\n"+
                 "Kredi kart numarasi  : " +
                 "**** **** **** " +
                 kkNo.substring( kkNo.length()-4)    // 1234 5678 2345 1234
        );

    }
}
