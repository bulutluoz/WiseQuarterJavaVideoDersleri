package K11_stringManipulations.Ders01;

import java.util.Locale;

public class C01_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // str'i kucuk harf olarak yazdirin

        System.out.println(str.toLowerCase()); // java candir


        /*
            method'lari kullanmak str'i kalici olarak degistirmez
            SADECE kullanildigi satir icin degistirir
         */

        // str 'i yazdiralim
        System.out.println(str); // Java Candir

        str.toUpperCase(); // Result of 'String.toUpperCase()' is ignored

        /*
         yukardaki satirda kod calisir
         AMMA yazdirma veya atama olmadigindan
         yaptigi islem 25.satirda kalir
         ne konsolda gorunur, ne de kalici bir degisiklik yapar
         */


        /*
        Kalici degisiklik yapmak istedigimizde ATAMA yapmaliyiz
         */

        // str'i kalici olarak buyuk harflerden olusan bir metne cevirin

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        str = str.toLowerCase();

        System.out.println(str); // java candir


        /*
            Eger bir dilde herhangi bir harfin buyuk/kucuk harf degisimi
            latin alfabesinden farkli ise toUpperCase() veya toLowerCase() kullanirken
            Localle tercihi kullanilabilir.

            ornegin str'i kucuk harfe cevirirsek,
            ingilizce alfabe kullandigi icin CANDIR ==> candir olur
            Eger I'yi toLowerCase() yaptigimizda turkce kucuk ı olmasini istersek
            Locale tercihi kullanabiliriz
         */

        String s = "Bağ bağcınındır";

        System.out.println(s.toUpperCase()); // BAĞ BAĞCININDIR

        s= s.toUpperCase(); // BAĞ BAĞCININDIR

        System.out.println(s.toLowerCase());  // bağ bağcinindir


        System.out.println(s.toLowerCase(Locale.forLanguageTag("Tr"))); // bağ bağcınındır


    }
}
