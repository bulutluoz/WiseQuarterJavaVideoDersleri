package K11_stringManipulations.Ders01;

public class C02_charAt {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // str'in ilk harfini yazdirin

        System.out.println(str.charAt(0)); // J

        // str'daki bastan 9.karakteri yazdirin
        System.out.println(str.charAt(8)); // e


        // son harfi yazdirin
        System.out.println(str.charAt(12)); // r

        System.out.println(  str.charAt( 12)); // karakter sayisi olan 13'un 1 eksigidir

        // sondan 3. harfi yazdirin

        System.out.println(str.charAt(13 - 3)); // d


        // sondan 5. harfi yazdirin

        System.out.println( str.charAt( 13 - 5  )); // e


        /*
            charAt() ile son harfin index'inden buyuk bir sayi kullanildiginda
            Java StringIndexOutOfBounds (Verilen index String'in sinirlari disinda) hatasi verir
         */

        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException


    }
}
