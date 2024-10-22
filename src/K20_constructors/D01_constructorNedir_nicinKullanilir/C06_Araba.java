package K20_constructors.D01_constructorNedir_nicinKullanilir;

public class C06_Araba {

    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat ;

    C06_Araba(){

    }

    /*
         bir Kod blogunun constructor olmasi icin
         MUTLAKA 2 sarti karsilamasi gerekir
           1- ismi class ismi ile ayni olmalidir (buyuk harfle baslar)
           2- return type olmamalidir
     */

    public static void method1(){

    }

    public static int maxHiz(String marka, String model, int yil, String yakitTuru){

        int maxHiz =0 ;

        return maxHiz;
    }



    public void C06_Araba(){

    }


    /*
        method isimleri ortak kabul olarak
           - kucuk harfle baslar
           - ismi class ismi ile ayni olmaz

        ANCAKKK
           ismi buyuk harfle baslarsa,
           hatta class ismi ile de ayni olursa
           Java altini kirmizi cizmez,
           sadece uygun bir isimlendirme olmadigini gostermek icin
           sari hale getirir

           Method name 'C06_Araba' is the same as its class name
     */



    //public c06_Araba(){

    //}
    // 51-53 deki kod blogu Constructor OLAMAZ ==> cunku ismi class ismi ile ayni degil
    //                      method da olamaz ==> return type yok
    // Java buna izin vermez CTE olusur, kod calismaz


}
