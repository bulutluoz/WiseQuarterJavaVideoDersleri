package K26_stringBuilder;

public class C04_Karsilastirma {

    public static void main(String[] args) {

        String str = "Ali";
        StringBuilder sb1 = new StringBuilder("Ali");
        StringBuilder sb2 = new StringBuilder("Ali");

        // ayni metne sahip olan str, sb1 ve sb2'yi karsilastiralim


        //  1-   ==  ile  karsilastiralim

        /*
            Java non-primitive data turlerinde farkli data turlerinin == ile karsilastirilmasina izin vermez.
            StringBuilder'lari == ile karsilastirirsaniz
            Java bu karsilastirmaya itiraz etmez AMMA sonuc her zaman false'dur
         */

        // System.out.println( str == sb1);
        // Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'

        System.out.println(sb1 == sb2); // false



       // 2-  equals() ile karsilastiralim

        /*
            Java equals() ile String ile StringBuilder'i karsilastirmaya itiraz etmez
            AMMA sonuc her zaman false'dur

            iki StringBuilder'i da equals() ile karsilastirirsaniz
            ikisinin de metni ayni olsa da sonuc false olur

            sadece sb1.equals(sb1)  yani bir StringBuilder kendisi ile karsilastirilirsa
            sonuc true olur
         */


        System.out.println(str.equals(sb1));  // false
        // Result of 'str.equals(sb1)' is always 'false'
        // 'equals' between objects of inconvertible types 'String' and 'StringBuilder'

        System.out.println(sb1.equals(sb2));  // false
        // Suspicious call to 'equals()' on 'StringBuilder' object


        System.out.println(sb1.equals(sb1));  // true








        // 3- compareTo() ile karsilastiralim

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Tava");
        StringBuilder sb5 = new StringBuilder("java");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("Tema");
        StringBuilder sb8 = new StringBuilder("Java");

        /*
            StringBuilder'larin metinsel esitligi compare() kontrol edilir
            compareTo() ile 2 StringBuilder karsilastirildiginda sonuc 0 ise
            bu iki StringBuilder metinsel olarak AYNI demektir
            sonuc 0 degilse metinler ayni degil demektir

            compare() ilk karakterlerden baslayarak
            her iki StringBuilder'daki tum index'lerdeki karakterleri compare eder
            EGER bir index'de ayni olmayan karakterler bulursa
            bu iki karakter arasindaki ASCII deger farkini yazdirir

         */

        System.out.println(sb3.compareTo(sb4)); // Java <==> Tava   -10  J K L M N O P Q R S T
        System.out.println(sb3.compareTo(sb5)); // Java <==> java   -32
        System.out.println(sb3.compareTo(sb6)); // Java <==> Tele   -10
        System.out.println(sb6.compareTo(sb7)); // Tele <==> Tema   -1 T-T, e-e, l-m l m'den 1 geride ==> -1
        System.out.println(sb3.compareTo(sb8)); // Java <==> Java   J-J, a-a, v-v, a-a farkli karakter yok ==> 0


    }
}
