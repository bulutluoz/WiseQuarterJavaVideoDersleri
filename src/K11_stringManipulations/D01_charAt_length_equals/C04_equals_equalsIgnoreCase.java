package K11_stringManipulations.D01_charAt_length_equals;

public class C04_equals_equalsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ALI";
        String str3 = "ali";
        String str4 = "Ali ";
        String str5 = "Ali";

        /*
            String'leri karsilastirmak icin  == kullandigimizda
            hem METNI hem de String'in referansini kontrol eder.

            == ile karsilastirdigimizda METNI ayni olan String'ler icin
            bazen true bazen false sonuc verir.
            Bunu ilerde gorecegiz ama SIMDILIK String'leri karsilastirmak icin == kullanmiyoruz

            equals(str1,str2) verilen String'leri
            SADECE METIN olarak karsilastirir
            metinler ayni ise TRUE degeri verir
            metinlerde farkli karakterler veya case farkliligi varsa FALSE degeri verir

         */

        System.out.println(str1.equals(str2)); // Ali <==> ALI ==> false
        System.out.println(str1.equals(str3)); // Ali <==> ali ==> false
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> false
        System.out.println(str1.equals(str5)); // Ali <==> Ali ==> true
        System.out.println(str2.equals(str3)); // ALI <==> ali ==> false


        // EGER sadece buyuk kucuk harf farkliliklarini GOZARDI etmek istersek

        System.out.println("===================");

        System.out.println(str1.equalsIgnoreCase(str2)); // Ali <==> ALI ==> true
        System.out.println(str1.equalsIgnoreCase(str3)); // Ali <==> ali ==> true
        System.out.println(str1.equalsIgnoreCase(str4)); // Ali <==> Ali ==> false
        System.out.println(str1.equalsIgnoreCase(str5)); // Ali <==> Ali ==> true
        System.out.println(str2.equalsIgnoreCase(str3)); // ALI <==> ali ==> true

    }
}
