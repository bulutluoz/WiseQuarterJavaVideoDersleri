package K04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {

    public static void main(String[] args) {



        // kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, islem sonucunu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki adet pozitif tamsayi giriniz...");

        int sayi1 = scanner.nextInt(); // 24
        int sayi2 = scanner.nextInt(); // 8

        System.out.println(  "sayilarin birbirine bolumu : "  + (sayi1/sayi2)  ); // 24 / 5 ==> 4.8 Java 4 yazdirdi

        // NOT : Java'da iki tamsayiyi birbirine bolerseniz
        //       Java islem sonucunun tamsayi kismini alir


        System.out.println(  "sonucu double'a cast edersek : "  + (double)(sayi1/sayi2)  );
        // once bolme islemini yapacagindan 4 bulur
        // sonra double'a cast eder ve 4.0 yazdirir


        System.out.println(  "sayilardan birini double'a cast edersek  : "  + (   sayi1/ (double) sayi2    )  );



        // NOT : bir tamsayiyi 10'a bolersek, birler basamagini silmis oluruz

        System.out.println(  243 / 10 ); // 24.3 ==> 24

        System.out.println(5234 / 10 ); // 523.4 ==> 523

        System.out.println( 523 / 10 ) ; // 52.3 ==> 52


    }
}
