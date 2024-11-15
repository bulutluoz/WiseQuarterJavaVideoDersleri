package K32_interfaces;

public interface I02_Interfaces {

    /*
        interface'de olusturulan her variable
        public static ve final'dir
        bu keyword'leri yazsak da, yazmasak da bu degismez
     */

    public static final int SAYI = 20;
    public final String str ="Java candir";
    //public static char chr ;
    boolean bl = true;


    public static void main(String[] args) {
        /*
          variable'larin onunde static yazmasa da
          static main method icinden kullanabiliriz
          cunku interface icindeki tum variable public, static ve final'dir
         */
        System.out.println(bl);

        /*
         variable'larin onunde final yazmasa da
         interface icindeki tum variable public, static ve final'dir
         final variable'larin degeri DEGISTIRILEMEZ

         Cannot assign a value to final variable 'sayi'
         */
        // SAYI = 30;


        /*
         interface icinde olusturulan her variable public, static ve final'dir
         final oldugu icin sonradan degistirme imkani yoktur
         char chr;  normalde class level variable'lara atama yapmak zorunlu degildir
         Ancak interface'de sonradan atama yapamayacagimiz icin basta deger atamak ZORUNLUDUR
         */
        //chr = 'a';

        /*
         Genel bir kabul olarak
         Java'da public static final varioable'lar
         kullanicilarin dikkatini cekmek icin tamamen buyuk harflerle isimlendirilir
         */

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Math.E); // 2.718281828459045
        System.out.println(Math.PI); // 3.141592653589793


    }
}
