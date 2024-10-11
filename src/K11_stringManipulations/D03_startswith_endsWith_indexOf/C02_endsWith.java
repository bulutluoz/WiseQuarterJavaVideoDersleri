package K11_stringManipulations.D03_startswith_endsWith_indexOf;

public class C02_endsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // metin "zevkli" ile mi bitiyor ?
        System.out.println(str.endsWith("zevkli")); // true

        // metin "zevkli" iceriyor mu?
        System.out.println(str.contains("zevkli")); // true

        // metin "zevkli" ile mi basliyor?
        System.out.println(str.startsWith("zevkli")); // false

        // metin "zevkli" mi?
        System.out.println(str.equals("zevkli")); // false

        // metin "li" ile mi bitiyor ?
        System.out.println(str.endsWith("li")); // true

        // metin "vkli" ile mi bitiyor ?
        System.out.println(str.endsWith("vkli")); // true

        // metin "Java ogrenmek cok zevkli" ile mi bitiyor ?
        System.out.println(str.endsWith("Java ogrenmek cok zevkli")); // true

        // metin "" ile mi bitiyor ?
        System.out.println(str.endsWith("")); // true


    }
}
