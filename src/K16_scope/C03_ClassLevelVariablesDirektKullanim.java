package K16_scope;

public class C03_ClassLevelVariablesDirektKullanim {

    /*
        - static variable'lar TUM Class'dan direkt olarak kullanilabilirler

        - instance variable'lar
              instance variable'lar static olmadiklarindan
              secim hakki method'a gecer
               * eger method static ise instance variable'larin direkt kullanilmasini kabul etmez
               * eger method da static degilse instance variable'lar direkt kullanilabilir

         Ister static ister instance olsun
         Class level variable'lar deger atamadan deklare edilebilir
         VE deger atamadan kullanilabilir

         Bir class level variable'a biz deger atamazsak
         Java belirlenmis olan degerlerin(default deger) atamasini yapar
         non-primitive ==> null
         sayisal primitive ==> 0
         boolean ==> false
         chr ==> hiclik
     */

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {
        // static int a = 34; // Modifier 'static' not allowed here
        System.out.println(strS); // Ali
        System.out.println(sayiS); // 0
        sayiS=45;
        System.out.println(sayiS); // 45
        System.out.println(chrS); // #
        System.out.println(blS); // false

        //System.out.println(strI);
        // Non-static field 'strI' cannot be referenced from a static context
        // static olmayan strI static alandan KULLANILAMAZ
        //System.out.println(sayiI);

    }

    public static void method1(){
        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        // strI = "Java";
        // Non-static field 'strI' cannot be referenced from a static context
        // System.out.println(sayiI);

    }


    public void method2(){
        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        System.out.println(strI);
        sayiI= 34;
        chrI='p';
        System.out.println(blI);

    }
}




