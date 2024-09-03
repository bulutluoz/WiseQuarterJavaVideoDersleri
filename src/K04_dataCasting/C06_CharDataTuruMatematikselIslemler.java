package K04_dataCasting;

public class C06_CharDataTuruMatematikselIslemler {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        // char data turundeki bir variable'i veya degeri
        // matematiksel islemlerde kullanirsaniz
        // Java direk ASCII table'daki degeri ile isleme alir

        System.out.println( chr1 + chr2 + chr3 ); // 97 + 98 + 99 ==> 294


        System.out.println( 'a' + 'b' + 'c'); // 97 + 98 + 99 ==> 294


        System.out.println( "a" + "b" + "c"); // abc String toplanan metinleri YANYANA yazdirir



        // sayi olarak verilmis bir degerin char karsiligini yazdirin

        int sayi1 = 97; // a
        int sayi2 = 65; // A

        System.out.println( (char) sayi1 );
        System.out.println( (char) sayi2 );


        // verilen bir harfin sonrasindaki 3 karakteri yazdirin
        // Orn : verilen harf : k ise sonraki 3 karakter : l, m, n

        char ch5 = 'k';

        System.out.println(

                (char)(ch5 + 1) +", " + (char) (ch5+2) + ", " + (char)(ch5+3)
        ); // l, m, n



        // verilen bir karakterin 'k' dan sonra olup olmadigini yazdirin

        char chr6 = 'a';
        char chr7 = 'm';

        System.out.println(  chr6 > 'k'); //  97 > 108 ==> false

        System.out.println(  chr7 > 'k'); //  110 > 108 ==> true


    }
}
