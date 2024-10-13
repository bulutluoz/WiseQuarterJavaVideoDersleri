package K16_scope;

public class C04_InstancevariablesObjeIleKullanim {
    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {
        // static alanda instance variable'i direkt kullanamayiz
        // System.out.println(chrI);
        System.out.println(strS); // Ali
        System.out.println(chrS); // #

        C04_InstancevariablesObjeIleKullanim obj = new C04_InstancevariablesObjeIleKullanim();

        System.out.println(obj.strI); // null
        System.out.println(obj.blI); // true
        System.out.println(obj.chrI); // hiclik
        obj.sayiI = 45;
        // System.out.println(sayiI); // Non-static field 'sayiI' cannot be referenced from a static context
        System.out.println(obj.sayiI);  // 45

        System.out.println(obj.blS); // null
        // Static member 'blS' accessed via instance reference
        System.out.println(blS); // null


    }

    public static void method1(){

    }

    public void method2(){
        System.out.println(strI);

    }
}
