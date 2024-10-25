package K20_constructors.D03_constructorCall;

public class C01 {
    /*
        Bir class'da signature'lari farkli olmak sartiyla birden fazla constructor olabilir

        Ayni sekilde signature'lari farkli olmak sartiyla AYNI isimde birden fazla method bulunabilir

        Method isimleri icin genel kural  : kucuk harfle baslar ve class ismi ile ayni olmaz
        ancak class ismi ile ayni olsa da java CTE vermez
     */
    /*
        Method call icin methodIsmi(ilgili parametreler) yazmak yeterlidir.
        main method veya baska bir kod blogundan method call yapilabilir
     */
    /*
        ConstructorCall'u method call'dan ayirmak icin Java
        ConstructorCall icin constructor ismini degil this keyword'unu kullanmayi tercih etmistir.

        this.  kullanildiginda o class'daki class level variable'lara gidiyordu
        this(ilgiliParametreler) de constructorCall icin kullanilir
     */

    C01(){
        System.out.println("parametresiz constructor calisti");
    }
    C01(int sayi){
        C01("ali");// method call
        System.out.println("int parametreli constructor calisti");
    }
    C01(String str){
        this();
        System.out.println("String parametreli constructor calisti");
    }

    public static void main(String[] args) {

        C01 obj3 = new C01("Selim");

        // C01 obj2 = new C01(4);


        // C01(); // Non-static method 'C01()' cannot be referenced from a static context
        // C01 obj = new C01();  // parametresiz constructor calisti
        // obj.C01(); // parametresiz method calisti

    }

    void C01(){ // Method name 'C01' is the same as its class name
        System.out.println("parametresiz method calisti");
        C01(3);
    }
    void C01(int sayi){ // Method name 'C01' is the same as its class name
        System.out.println("int parametreli method calisti");
    }
    void C01(String str){ // Method name 'C01' is the same as its class name
        System.out.println("String parametreli method calisti");
    }



}
