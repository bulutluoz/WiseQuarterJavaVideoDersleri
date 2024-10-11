package K13_methodOlusturmaVeKullanma.D03_MethodOverloading;

public class C03_Overloading {

     /*
        Java method call'daki signature'a %100 uyumlu olan bir method bulamazsa
        auto-widening kullanarak calistirabilecegi method var mi diye kontrol eder
        ve varsa calistirir

        Eger kullanilan argumanlar icin auto-widening kullanarak calistirabilecek
        birden fazla method olursa, en az casting yapani tercih eder
     */

    public static void main(String[] args) {

        topla(5); // topla int ==> 1 ==> Tek integer : 10
        topla(2.3,3.5); // topla double double ==> 5 ==> double double : 5.8

        topla(2.4,'b'); // topla double char ==> YOK ==> double int : 100.4


    }

    public static void topla(int sayi){ // topla int

        System.out.println("Tek integer : " + (sayi + sayi));

    }//1  topla int

    public static void topla(int a, int b){ // topla int int

        System.out.println("int int : " + (a+b));
    }//2  topla int int

    public static void topla(double c, int d){ // topla double int

        System.out.println("double int : " + (c+d));
    }//3 topla double int

    public static void topla(float c, int d){ // topla float int

        System.out.println("float int : " + (c+d));
    }//4 topla float int

    public static void topla(double c, double d){ // topla double double

        System.out.println("double double : " + (c+d));
    }//5 topla double double



}
