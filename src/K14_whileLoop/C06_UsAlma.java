package K14_whileLoop;

public class C06_UsAlma {

    public static void main(String[] args) {


        // Soru 5- Verilen bir sayi ve pozitif tamsayi us icin
        //         While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //         bir method olusturun.

        // Ornek  sayi 2, us 5 ise
        //        sonuc : 2 * 2 * 2 * 2 * 2 ==> 32


        usHesaplaYazdir(2,5); // 32
        usHesaplaYazdir(3,4); // 81.0
        usHesaplaYazdir(3.4,2); // 11.56
        usHesaplaYazdir(-2.1,4); // 19.448100000000004

    }


    public static void usHesaplaYazdir( double sayi , int pozitifUs  ){

        double sonuc = 1;

        while ( pozitifUs > 0 ){
            sonuc *= sayi;
            pozitifUs--;
        }

        System.out.println(sonuc);
    }
}
