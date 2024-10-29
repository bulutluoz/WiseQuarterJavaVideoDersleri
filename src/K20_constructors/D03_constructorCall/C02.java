package K20_constructors.D03_constructorCall;

public class C02 {
    String isim = "Ali";
    int sayi = 40;
    C02(){
        System.out.println("parametresiz constructor calisti");
        C02(); // ==> parametresiz C02 method'una goturur
    }//C1
    C02(int sayi){
        this();
        System.out.println("int parametreli constructor calisti");
        this.sayi = sayi;
    }//C2
    C02(String isim){
        System.out.println("String parametreli constructor calisti");
        this.C02();
        this.isim=isim;
        sayi = 20;
    }//C3
    public static void main(String[] args) {
        C02 obj3 = new C02("Leyla");
        //String parametreli constructor calisti
        //parametresiz method calisti
        System.out.println(obj3.isim); // Leyla
        System.out.println(obj3.sayi); // 20

        C02 obj2 = new C02(3);
        //parametresiz constructor calisti
        //parametresiz method calisti
        //int parametreli constructor calisti
        System.out.println(obj2.isim); // Ali
        System.out.println(obj2.sayi); // 3

        C02 obj1 = new C02(); // parametresiz constructor calisir
        //parametresiz constructor calisti
        //parametresiz method calisti
    }

    void C02(){
        System.out.println("parametresiz method calisti");
    } // M1





}
