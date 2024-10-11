package K11_stringManipulations.D04_nullPointer_replace;

public class C05_replaceAll {

    public static void main(String[] args) {

        String str = "Ali okula gitti. 3 saat sonra gelecek";

        // tum t'leri T yapin
        System.out.println(str.replace("t", "T")); // Ali okula giTTi. 3 saaT sonra gelecek
        System.out.println(str.replace('t', 'T')); // Ali okula giTTi. 3 saaT sonra gelecek
        System.out.println(str.replaceAll("t", "T")); // Ali okula giTTi. 3 saaT sonra gelecek

        // 3'u yerine 2 yazin
        System.out.println(str.replace("3", "2")); // Ali okula gitti. 2 saat sonra gelecek
        System.out.println(str.replace('3', '2')); // Ali okula gitti. 2 saat sonra gelecek
        System.out.println(str.replaceAll("3", "2")); // Ali okula gitti. 2 saat sonra gelecek


        /*
            replace() method'u verilen metinde aranan char veya string'in
            tum kullanimlarini bulur ve istenen yeni deger ile degistirir

            replaceAll() da ayni islevi yapabilir,
            ama asil kullanim amaci ve farki regex kullanilmasidir

         */


        str = "Kredi karti numaram 1234 3456 3421 6754";
        // tum sayilari * yapin
        System.out.println(str.replaceAll("\\d", "*"));
        // Kredi karti numaram **** **** **** ****


        str = "Mehmet siyavusligil./%";
        // str'i ilk harfi buyuk harf, kalan tum harfleri * olacak sekilde degistirin
        // bosluk ve ozel karakterlere dokunmayin

        System.out.println(


                str.substring(0,1).toUpperCase()+
                str.substring(1)    .replaceAll("\\w","*")

        );



    }
 }
