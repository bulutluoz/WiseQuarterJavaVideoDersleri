package K11_stringManipulations.Ders02;

public class C02_substring_IkiParametre {

    public static void main(String[] args) {

        String str = "Java ogrenen pisman olmaz...";

        // ilk kelime haric cumleyi yazdirin


        // sadece 2.kelimeyi yazdirin


         /*
            substring (baslangicIndex) ==> baslangic index'inden baslayip metnin sonuna kadar yazdirir

            substring(basInd, bitInd) ==> baslangic index'i(dahil) ile bitis index'i (haric)
                                          arasinda kalan karakterleri yazdirir

            ONEMLI NOT : java'da genel olarak
                         baslangic index'leri DAHIL, bitis index'leri HARIC'tir
         */

        System.out.println(str.substring(2, 4)); // me



        // sadece 3. harfi String olarak baska bir variable'a kaydedin



        /*
            charAt(2) method'u ile bir karakteri elde edebiliriz
            ANCAK charAt() bize char dondurdugu icin String Manipulation yapamayiz

            substring(2,3) bize harfi String olarak getirdigi icin
            hazir method'lari kullanabiliriz.
         */


        // baslangic ve bitis index'leri ayni olursa ...



        // baslangic index'i  bitis index'den buyuk olursa ...



        // bastan 10 karakteri yazdirin


        // 15.index'den baslayip, 8 karakter yazdirin


        // bastan 3.karakterden baslayip,
        // sondan 3.karaktere kadar(dahil) olan bolumu yazdirin





    }

}
