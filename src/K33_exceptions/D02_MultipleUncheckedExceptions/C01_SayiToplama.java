package K33_exceptions.D02_MultipleUncheckedExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_SayiToplama {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere tamsayilar isteyin
        // ve kullanici q veya Q'ya basincaya kadar islemi devam ettirin
        // Kullanici q'ya bastiginda
        // kac adet sayi girildigini ve toplamin ne oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        int girilenSayi = 0;
        String girilenMetin = "";


        while (  !girilenMetin.equalsIgnoreCase("q") ){

            System.out.println("Lutfen toplanmak uzere bir tamsayi giriniz...\nBitirmek icin Q'ya basin");


            try {
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
                sayac++;

            }catch (InputMismatchException e){  // kullanici masum olarak Q'ya bastiginda
                                                // veya giciklik hakkini kullandiginda kod buraya gelir
                girilenMetin = scanner.nextLine();

                if ( ! girilenMetin.equalsIgnoreCase("Q")){
                    System.out.println("Girilen deger ya tamsayi olmali veya Q olmali");
                }

            }

        }

        System.out.println("Giirilen " + sayac + " adet sayinin toplami : " + toplam);





    }
}
