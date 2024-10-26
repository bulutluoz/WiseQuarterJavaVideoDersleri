package K21_staticKeyword;

public class C03_StaticBlocks {
    /*
        static blocklar class calismaya baslarken
        herseyden (hattta main method'dan bile) once calisirlar

        Kullanim amaci class calismaya baslamadan ONCE,
        YAPILMASI gereken ayarlamalar VARSA, onlari yapmaktir.

        static block'larin yeri onemli degildir
        en altda da olsa once onlar calisir

        birden fazla static block varsa kendi iclerinde once ustteki calisir
     */
    /*
        static olmayan bloklar
        obje olusturulmadan once yapilacak ayarlamalar icin kullanilir
        her constructor calismasindan once static olmayan block calisir
     */

    C03_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C03_StaticBlocks obj1 = new C03_StaticBlocks();

        C03_StaticBlocks obj2 = new C03_StaticBlocks();
    }

    public static void method1(){
        System.out.println("method calisti");
    }

    static {
        System.out.println("static block1 calisti");
    }

    static {
        System.out.println("static block2 calisti");
    }

    {
        System.out.println("static olmayan kod blogu calisti");
    }

}
