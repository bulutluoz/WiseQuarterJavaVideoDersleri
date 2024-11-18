package K33_exceptions.D04_throwVeFinalyKeywords;

public class C01_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1- NullPointerException

        String str = null ;

        String s;
        // System.out.println(s); // Variable 's' might not have been initialized

        String t = "";
        // t variab;e'ina deger atanmistir, dolayisiyla java t'yi deger atanmamis kabul etmez

        System.out.println(str); // null
        System.out.println("Ali " + str); // Ali null

        //System.out.println(str.length()); // NullPointerException
        // System.out.println(str.toUpperCase()); // NullPointerException

        /*
             null bir deger degil, isaretcidir
             gorevi str'a deger atanmadigini gostermektir
             str'i yazdirirsaniz null yazdirir
             ama herhangi bir method'la kullanmak isterseniz
             NullPointerException verir
         */



        // 2- StringIndexOutOfBoundsException
        // 3- ArrayIndexOutOfBoundsException

        // 4- ArithmeticException : Matematiksel hatalarda olusur
        //                           orn : 9 / 0

        // 5- RunTimeException : Kod calismaya basladiktan sonra ortaya cikan
        //                       tum exception'larin Parent class'idir

        // 6- Exception : Tum Exception'larin parent'idir.

        // 7- FileNotFoundException : IOException'in child'idir
        //                            Dosyaya ulasilmak istendiginde dosya bulunamazsa olusur

        // 8- IOException : Dosya okuma veya dosyaya bilgi yazdirma ile ilgili
        //                  tum exception'larin parent'idir

        // 9 - NumberFormatException : String olarak verilen bir sayiyi parse ederken
        //                             String digit olmayan bir karakter icerirse olusur
        String str1 = "23"; // "23a" yazarsak Parse method'u calisamaz ve NumberFormatException verir
        String str2 = "34";

        // str1 ve str2'yi matematiksel olarak toplayin
        System.out.println( "String olarak verilen fiyatlarin toplami : " +(Integer.parseInt(str1) + Integer.parseInt(str2))   ); // 57

        // 10 - ClassCastException : Class casting yaparken
        //                           yapilmayacak bir casting'i syntax'a uydurarak yapmaya calisirsak olusur

        // Non-primitive data turlerinde
        // bir data turundeki degeri, baska data turundeki variable'a ATAYAMAZSINIZ
        // BU KURALIN ISTISNASI parent - child class'lar arasinda atama YAPILABILIR

        Integer sayi = 20;

        // Double dbl = sayi;  Integer ve Double arasinda parent child iliskisi yok, buna izin vermez

        Object obj = sayi; // Integer IS-A Object diyebiliyoruz, aralarinda parent child iliskisi var.

        System.out.println(obj); // 20

        Double dbl = (Double) obj;   // Object HAS-A Double iliskisi var, Object Parent
                                     // Bu atamayi casting ile yapabiliriz
                                     // ClassCastException
                                     // Integer cannot be cast to class java.lang.Double

        System.out.println("dbl : " + dbl);

        // 11 - IllegalArgumentException


    }
}
