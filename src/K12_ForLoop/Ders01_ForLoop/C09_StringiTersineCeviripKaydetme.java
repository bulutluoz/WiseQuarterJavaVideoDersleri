package K12_ForLoop.Ders01_ForLoop;

import java.util.Scanner;

public class C09_StringiTersineCeviripKaydetme {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

             tersMetin += metin.charAt(i);
        }


        System.out.println("Verilen metnin tersten yazisilisi : " + tersMetin);


        // Girilen metnin Palindrome olup olmadigini yazdirin
        // Palindrome tersi kendisine esit olan metin    madam ==> madam


        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        } else {
            System.out.println("Girilen metin PALINDROME DEGIL");
        }


    }
}
