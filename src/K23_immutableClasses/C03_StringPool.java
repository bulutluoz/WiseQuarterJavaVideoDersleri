package K23_immutableClasses;

public class C03_StringPool {

    public static void main(String[] args) {

        String str1 = "Ali"; // havuzda
        String str2 = "Ali"; // havuzda
        String str3 = new String("Ali"); // havuzda degil
        String str4 = "A" + "li"; // havuzda
        String s = "A"; // havuzda
        String t = "li"; // havuzda
        String str5 = s + t ; // havuzda degil
        String r = "ali"; // havuzda
        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1); // havuzda degil
        // "Ali"  havuzda


        /*
            Java'da temel olarak 2 turlu String olusturabiliriz
            1- en basit yontem olan " " icinde yazarak veya " " lari + ile birlestirerek
            2- new keyword veya method'lar kullanilarak

            Java obje olusturmada tasarruf etmek icin
            1.yontemle olusturulan String'leri ayri bir String Pool'da tutar

            EGERRRR 1.yontemle bir String olusturdugumuzda
                    String pool'da daha once ayni degere sahip bir String varsa
                    Java yeni String'i eski String ile eslestirir
                    ayni referans ve ayni degeri kullanmalarini saglar
         */


        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true

        System.out.println("======================");

        /*
            String ifadelerin esitligini kontrol etmek icin == kullanirsak
            metni ayni olan ifadeler icin her zaman true vermez

            == Sadece metne bakmaz, metne ve referansa birlikte bakar
               yani true olmasi icin hem metnin, hem de referansin ayni olmasi gerekir
               bu da ancak String Pool'da olup metni ayni olan String'ler icin MUMKUNDUR

            equals() ise SADECE metne bakar, metin ayni ise true verir
         */

        /*
                Havuzda olanlar : str1, str2, str4, s, t, r, "Ali"
                Havuzda olmayanlar : str3, str5, str6
         */


        System.out.println(str1 == str2); // Ali <==> Ali  ==> true
        System.out.println(str1 == str3); // Ali <==> Ali  ==> false
        System.out.println(str1 == str4); // Ali <==> Ali  ==> true
        System.out.println(str1 == str5); // Ali <==> Ali  ==> false
        System.out.println(str1 == str6); // Ali <==> Ali  ==> false
        System.out.println(str1 == "Ali"); // Ali <==> Ali  ==> true
        System.out.println(str2 == "Ali"); // Ali <==> Ali  ==> true
        System.out.println(str3 == str4); // Ali <==> Ali  ==> false
        System.out.println(str5 == str6); // Ali <==> Ali  ==> false
        System.out.println(str6 == str2); // Ali <==> Ali  ==> false





    }
}
