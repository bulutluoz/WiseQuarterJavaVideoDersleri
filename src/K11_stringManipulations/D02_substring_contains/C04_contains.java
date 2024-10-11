package K11_stringManipulations.D02_substring_contains;

public class C04_contains {

    public static void main(String[] args) {

        String str = "Hayatin her asamasinda Java kullanilir.";

        /*
            Verilen bir String'in istenen bir harf
            veya metni icerip icermedigini anlamak icin kullanilir
         */

        System.out.println(str.contains("a")); // true

        System.out.println(str.contains("H")); // true

        /*
           contains method'u aranan harf veya metnin kac kere kullanildigi ile ILGILENMEZ
         */









        // Hayatin her asamasinda Java kullanilir.

        /*
             contains method'u aradigi metni case sensitive olarak
             ve metinde kullanildigi sekilde arar
         */

        System.out.println(str.contains("k")); //

        System.out.println(str.contains("her")); //

        System.out.println(str.contains("r a")); //

        System.out.println(str.contains("ra")); //

        System.out.println(str.contains("H y")); //

        System.out.println(str.contains("A")); //

        System.out.println(str.contains("Java")); //

        System.out.println(str.contains("java")); //





        /*
            contains() char parametre kabul etmez
         */



    }
}
