package K11_stringManipulations.D02_substring_contains;

public class C02_substring_IkiParametre {

    public static void main(String[] args) {

        String str = "Java ogrenen pisman olmaz...";

        // ilk kelime haric cumleyi yazdirin

        System.out.println( str.substring(5) ); // ogrenen pisman olmaz...


        // sadece 2.kelimeyi yazdirin

        System.out.println(str.substring(5, 12)); // ogrenen

         /*
            substring (baslangicIndex) ==> baslangic index'inden baslayip metnin sonuna kadar yazdirir

            substring(basInd, bitInd) ==> baslangic index'i(dahil) ile bitis index'i (haric)
                                          arasinda kalan karakterleri yazdirir

            ONEMLI NOT : java'da genel olarak
                         baslangic index'leri DAHIL, bitis index'leri HARIC'tir
         */

        System.out.println(str.substring(2, 4)); // va

        // sadece 3. harfi String olarak baska bir variable'a kaydedin


        // String istenenHarf = str.charAt(2);  charAt() char getirdigi icin String variable'a atayamayiz

        // str.charAt(2). char getirdigi icin String method'lari kullanilamaz


        /*
            charAt(2) method'u ile bir karakteri elde edebiliriz
            ANCAK charAt() bize char dondurdugu icin String Manipulation yapamayiz

            substring(2,3) bize harfi String olarak getirdigi icin
            hazir method'lari kullanabiliriz.
         */

        String istenenHarf = str.substring(2,3);

        // 7.index'deki harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(7, 8).toUpperCase()); // R


        // baslangic ve bitis index'leri ayni olursa ...
        // "Java ogrenen pisman olmaz..."


        System.out.println(str.substring(2, 2)); // hiclik

        // baslangic index'i  bitis index'den buyuk olursa ...


        // System.out.println(str.substring(8, 5));
        // StringIndexOutOfBoundsException: begin 8, end 5, length 28


        // bastan 10 karakteri yazdirin

        System.out.println(str.charAt(9));// n

        System.out.println( str.substring(9,10)); // n


        // 15.index'den baslayip, 8 karakter yazdirin

        System.out.println( str.substring(  15,23 )); // sman olm



        // bastan 3.karakterden baslayip,
        // sondan 3.karaktere kadar(dahil) olan bolumu yazdirin


        System.out.println(  str.substring( 2 , ( str.length()-2 ))  );
        // va ogrenen pisman olmaz.



    }

}
