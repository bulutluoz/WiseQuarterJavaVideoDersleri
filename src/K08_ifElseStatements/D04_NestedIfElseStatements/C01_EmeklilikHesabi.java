package K08_ifElseStatements.D04_NestedIfElseStatements;

import java.util.Scanner;

public class C01_EmeklilikHesabi {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: erkek, K:kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        /*
            Eger bir if else'de karar vermek icin baktigimiz
            variable sayisi birden fazla ise nested if else statement tercih edilebilir

            Oncelikle bakacagimiz 2 degiskenden birini
            ana degısken kabul edip sadece ona gore bir if else olustururuz

            biz cinsiyeti ana degisken kabul edelim
         */

        if (cinsiyet == 'K'){ // Bu suzgecten sadece kadinlar gececegi icin, yasi kadinlara gore degerlendirebiliriz

            if (yas<15 || yas>80){
                System.out.println("Girilen yas icin emeklilik kontrol edilemez");
            } else if (yas>=60) {
                System.out.println("Kadin, 60 yasindan buyuk. Emekli olabilir");
            } else {
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismalisin");
            }


        } else if (cinsiyet == 'E') {

            if (yas<15 || yas>80){
                System.out.println("Girilen yas icin emeklilik kontrol edilemez");
            } else if (yas>=65) {
                System.out.println("Erkek, 65 yasindan buyuk. Emekli olabilir");
            } else {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");
            }

        } else System.out.println("Cinsiyet olarak E veya K secmelisiniz");

    }
}
