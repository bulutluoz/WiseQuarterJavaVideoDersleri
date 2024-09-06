package K05_WrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi = 34;

        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.charAt(2)); // v

        // Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
        // WRAPPER CLASS'lari olusturmustur
        // boolean, char     , byte, short, int    , long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        int sayi1 = 5;
        Integer sayi2 = sayi1;

        Integer sayi3 = 3456;
        int sayi4 = sayi3;


        // primitive variable'lar ile ayni data turunun wrapper class'indaki variable'lar arasinda
        // gecis mumkundur
        // Ammma farkli wrapper class'lar arasinda gecis mumkun degildir
        // Ayni sekilde Wrapper class'dan olusturulan bir variable'a baska isimdeki primitive data turundeki
        // degeri de ATAYAMAYIZ


        int sayi5 = 25;
        short sayi6 = 45;
        byte sayi7 = 23;

        int sayi8 = sayi6; // int <== short
        sayi6 = sayi7 ; // short <== byte


        Short sayi9 = 45;
        // Integer sayi10 = sayi9;  // Integer <== Short

        // Integer sayi11 = sayi6 ; // Integer <== short



        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        System.out.println( fiyat1 + fiyat2 ); // 2345

        // Icinde SADECE sayilar oldugundan emin oldugumuz String'leri
        // Wrapper class'lari kullanarak sayiya cevirebiliriz

        int fiy1 = Integer.parseInt(fiyat1);
        int fiy2 = Integer.valueOf(fiyat2);

        System.out.println("Fiyatlarin toplami : " + ( fiy1 + fiy2)); // 68


        fiyat1 = "23.45";
        fiyat2 = "34.43";

        double f1 = Double.parseDouble(fiyat1);
        double f2 = Double.valueOf(fiyat2);

        System.out.println("Fiyatlarin toplami : " + ( f1 + f2)); // 57.88


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768


        // kullanicidan bir karakter alip
        char harf = 's';


        // verilen karakterin Buyuk Harf olup olmadigini yazdirin
        System.out.println(Character.isUpperCase(harf)); // false

        // verilen karakterin Kucuk Harf olup olmadigini yazdirin
        System.out.println(Character.isLowerCase(harf)); // true

        // verilen karakterin Sayi olup olmadigini yazdirin
        System.out.println(Character.isDigit(harf)); // false
        // verilen karakterin Harf olup olmadigini yazdirin
        System.out.println(Character.isLetter(harf)); // true
        // verilen karakterin Alfabetik olup olmadigini yazdirin
        System.out.println(Character.isAlphabetic(harf)); // true

        // verilen karakteri buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(harf)); // S


    }
}
