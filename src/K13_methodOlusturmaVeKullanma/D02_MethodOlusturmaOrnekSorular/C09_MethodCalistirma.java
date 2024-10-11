package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class C09_MethodCalistirma {

    public static void main(String[] args) {

        C01_AsalMiYazdir.asalMiYazdir(45); // Verilen 45 sayisi asal degil

        C01_AsalMiYazdir.asalMiYazdir(101); // Verilen 101 sayisi asal

        C02_KucukOlmayaniYazdir.kucukOlmayaniYazdir(23,67); // 67

        C03_MetniTerstenYazdir.metniTerstenYazdir("Java candir"); // ridnac avaJ
        System.out.println("");



        // asagida verilen metnin palindrome olup olmadigini yazdirin

        String metin = "Ey edip adanada pide ye";

        String tersMetin = C05_MetniTerseCevirme.metninTersiniDondur(metin); // lezug koc avaJ (konsolda gormeyiz)


        if ( metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Verilen metin palindrome");
        } else {
            System.out.println("Verilen metin palindrome degil");
        }


    }
}
