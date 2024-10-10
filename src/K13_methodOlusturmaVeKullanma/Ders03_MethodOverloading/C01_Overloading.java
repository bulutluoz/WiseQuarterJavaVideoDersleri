package K13_methodOlusturmaVeKullanma.Ders03_MethodOverloading;

public class C01_Overloading {
    public static void main(String[] args) {





        /*
            Java'da bir class icerisinde ayni isim ve ayni parametrelere sahip
            birden fazla method OLUSTURULAMAZ.

            Java'da AYNI CLASS icerisinde AYNI ISIMDE method olusturmak istersek
            bu method'larin SIGNATURE'lari farkli olmalidir

            Method Signature = method adi + parametrelerin data turleri ve dizilisi

            Bir class'da ISMI AYNI ama SIGNATURE"I farkli method'lar olusturulmasina
            OVERLOADING denir

            Ismi farkli olan method'lar icin OVERLOADING'den bahsedilemez

            Bir method call'un calismasi icin
            method call'da yazdigimiz argumentler ile
            method'daki parametreler uyumlu olmalidir

            Eger method call'daki argumentler icin UYGUN bir method yoksa
            CTE olusur, Java kodu kirmizi cizer ve kod calismaz
         */

        // topla("ali","veli");

    }

    public static void topla(int sayi1 , int sayi2){ // topla int int
        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    } // topla int int

    public static void carpim(int sayi1 , int sayi2){ // topla int int
        System.out.println("Iki int sayinin toplami : " + (sayi1*sayi2));
    } // carpim int int

    public static void topla(int sayi1 , int sayi2, int sayi3){ // topla int int
        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    } // topla int int int

    public static void topla(int a ){
        System.out.println("Iki int sayinin toplami : " + (a+a));
    }// topla int

    public static void topla(double sayi1 , int sayi2){
        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    }// topla double int

    public static void topla(int sayi1 , double sayi2){
        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    }// topla int double


}
