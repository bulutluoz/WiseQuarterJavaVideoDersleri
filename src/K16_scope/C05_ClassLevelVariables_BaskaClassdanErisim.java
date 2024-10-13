package K16_scope;

public class C05_ClassLevelVariables_BaskaClassdanErisim {

    /*
        Bir class'dan
        baska class'daki method'lara
        ve class level variable'lara ulasabiliriz

        Ancak bu kullanim icin dogru yontemi bilmeliyiz
     */
    public static void main(String[] args) {
    // kural1 - baska class'dan variable veya method'u direkt kullanamayiz
        //System.out.println( strI );
        //System.out.println( sayiS );
        //method1();
        //method2();

    // static class uyeleri classIsmi.classUyeIsmi seklinde kullanilabilir

        C04_InstancevariablesObjeIleKullanim.method1();
        System.out.println(C04_InstancevariablesObjeIleKullanim.strS);
        System.out.println(C04_InstancevariablesObjeIleKullanim.blS);
        C04_InstancevariablesObjeIleKullanim.sayiS = 56;

    // static olmayan method'lar ve instance variable'lar ise
    // obje uzerinden kullanilabilir

        C04_InstancevariablesObjeIleKullanim obj = new C04_InstancevariablesObjeIleKullanim();
        obj.method2();
        System.out.println(obj.strI);
        obj.chrI = '5';


    }
}
