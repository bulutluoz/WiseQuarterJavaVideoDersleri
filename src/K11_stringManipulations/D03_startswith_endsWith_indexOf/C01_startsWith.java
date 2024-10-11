package K11_stringManipulations.D03_startswith_endsWith_indexOf;

public class C01_startsWith {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyor ?
        System.out.println(str.startsWith("Java")); // true

        // str J ile mi basliyor ?
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("K")); // false

        // str Ja ile mi basliyor ?
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.startsWith("Ya")); // false

        // str "Java cok" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok")); // true
        System.out.println(str.startsWith("Java yok")); // false

        // str "j" ile mi basliyor ?
        System.out.println(str.startsWith("j")); // false

        // str "a" ile mi basliyor ?
        System.out.println(str.startsWith("a")); // false


        // "Java cok guzel";

        // str "Java cok guzel" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok guzel")); // true

        // str "" ile mi basliyor ?
        System.out.println(str.startsWith("")); // true


        // "Java cok guzel"

        // str "cok" ile mi basliyor?
        System.out.println(str.startsWith("cok")); // false

        // 5.index ve sonrasi "cok" ile mi basliyor ?  ==> cok guzel
        System.out.println(str.startsWith("cok", 5)); // true


        // 8.index ve sonrasi " " ile mi basliyor ? ==> " guzel"

        System.out.println(str.startsWith(" ", 8)); // true


    }
}
