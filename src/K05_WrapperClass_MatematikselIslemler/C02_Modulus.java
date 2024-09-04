package K05_WrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_Modulus {

    public static void main(String[] args) {

        System.out.println( 85 / 6 ); // 14,1... ==> 14

        System.out.println( 85 % 6 ); // 1

        System.out.println( 234 / 10 ); // 23,4 ==> 23

        System.out.println( 234 % 10 ); // 4


        // kullanicidan bir tamsayi isteyin
        // girilen sayinin birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        System.out.println("Sayinin birler basamagi : " +
                            girilenSayi%10);


        // girilen sayinin cift olup olmadigini yazdirin

        System.out.println( girilenSayi % 2);
        // kalan 0 ise cift sayidir
        // kalan 0 degilse cift degildir

        // girilen sayinin 5'e bolunup bolunmedigini yazdirin
        System.out.println( girilenSayi % 5);
        // kalan 0 ise 5 ile tam bolunuyor demektir

        // girilen sayinin 3'un tam kati olup olmadigini yazdirin
        System.out.println(girilenSayi % 3);
        // kalan 0 ise 3'un tam katidir
    }
}
