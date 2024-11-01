package K25_varargs;

public class C04_KodOkuma {

    public static void main(String[] args) {


    }


    public static void elemanYazdir(String s , int... v){

        System.out.println( v[s.length()-1] );

    }


    public static void islem(int sayi1, int sayi2,  int... sayilar){

        System.out.println(sayilar[sayi1] + sayilar[sayi2]);

    }



}
