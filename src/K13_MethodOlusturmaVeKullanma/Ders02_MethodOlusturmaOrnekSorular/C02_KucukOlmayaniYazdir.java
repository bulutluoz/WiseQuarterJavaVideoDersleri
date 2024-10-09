package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C02_KucukOlmayaniYazdir {

    public static void main(String[] args) {

        // verilen iki tamsayidan kucuk olmayani yazdiran bir method olusturun


        kucukOlmayaniYazdir(4,78); // 78

        kucukOlmayaniYazdir(-34,34); // 34

        kucukOlmayaniYazdir(23,23); // 23



    }

    public static void kucukOlmayaniYazdir( int sayi1 , int sayi2 ){


        System.out.println(  sayi1<sayi2 ? sayi2  : sayi1  );

    }



}
