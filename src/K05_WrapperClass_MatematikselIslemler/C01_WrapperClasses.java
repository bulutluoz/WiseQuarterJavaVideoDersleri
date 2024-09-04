package K05_WrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi = 34;

        System.out.println(str.charAt(1)); // a
        System.out.println(str.toUpperCase()); // JAVA CANDIR


        // Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
        // WRAPPER CLASS'lari olusturmustur
        // boolean, char     , byte, short, int    , long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        Integer sayi1 = 23;


        // primitive variable'lar ile ayni data turunun wrapper class'indaki variable'lar arasinda
        // gecis mumkundur


        int sayi3 = 25;
        short sayi4 = 45;
        byte sayi5 = 23;

        Integer sayi6 = sayi3;
        // Integer sayi7 = sayi4; // Wrapper class'lar ile AutoWidening olmaz
        int sayi8 = sayi4; // primitive data turleri arasinda auto widening vardir
        Integer sayi7 = (int)sayi4;  // short data turundeki sayi4'u once primitive int'a cast ettik

        Integer sayi9 = 25;
        int sayi10 = sayi9;



        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        int f1 = Integer.parseInt(fiyat1);
        int f2 = Integer.parseInt(fiyat2);

        System.out.println("String olarak fiyatlarin toplami : " + (fiyat1+fiyat2)); // 2345
        System.out.println("int'a cevirdigimiz fiyatlarin toplami : " + (f1+f2)); // 68


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Byte.MAX_VALUE); // 127




        // kullanicidan bir karakter alip
        char chr = 's';


        // verilen karakterin Buyuk Harf olup olmadigini yazdirin
        System.out.println(Character.isUpperCase(chr)); // false

        // verilen karakterin Kucuk Harf olup olmadigini yazdirin
        System.out.println(Character.isLowerCase(chr)); // true

        // verilen karakterin Sayi olup olmadigini yazdirin
        System.out.println(Character.isDigit(chr)); // false

        // verilen karakterin Harf olup olmadigini yazdirin
        System.out.println(Character.isLetter(chr)); // true

        // verilen karakterin Alfabetik olup olmadigini yazdirin
        System.out.println(Character.isAlphabetic(chr)); // true




    }
}
