package K13_methodOlusturmaVeKullanma.D03_MethodOverloading;

public class C02_Overloading {

    public static void main(String[] args) {



     /*
        Java method call'daki signature'a %100 uyumlu olan bir method bulamazsa
        auto-widening kullanarak calistirabilecegi method var mi diye kontrol eder
        ve varsa calistirir
     */

        topla(3,5); // topla int int ==> Iki int'in toplami : 8

        topla(3.4,2.3); // topla double double ==> Iki double'in toplami : 5.699999999999999

        topla(2.4, 5); // topla double int ==> Iki double'in toplami : 7.4

        topla('a',6); // topla char int ==> Iki int'in toplami : 103

    }

    public static void topla(int a, int b){ // topla int int

        System.out.println("Iki int'in toplami : " + (a+b));
    }

    public static void topla(double a, double b){ // topla double double

        System.out.println("Iki double'in toplami : " + (a+b));
    }




}
