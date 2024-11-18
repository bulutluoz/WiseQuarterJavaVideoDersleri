package K33_exceptions.D01_ExceptionNedir_TryCatchBloklari;

import java.util.Scanner;

public class C01_IfElseIleHataOnleme {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin

         /*
            Iyi bir kod yazari
            kod'da nerelerde hata olusabilecegini de ongorur
            ve o hata ihtimallerine karsi
            Java'ya yol gosterir

            Ornegin bu gorevde
            kullanicinin payda olarak 0 girmesini ongorup
            if ile bir cozum uretebiliriz

            AMMMAAA kullanici tamsayi yerine farkli bir deger girerse
            olusacak "InputMismatchException" 'i if else ile cozemeyiz

            Java ongorebilecegimiz bu tur sorunlari
            Java'nin cozup yoluna devam edebilmesi (handle) icin
            bize try-catch bloklari hazirlamistir
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz...");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 != 0){
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }else System.out.println("2.sayi 0 olamaz");

        System.out.println("Kod normal calisirsa bu satir yazdirilir");
    }
}
