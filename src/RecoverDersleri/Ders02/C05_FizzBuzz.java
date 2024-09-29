package RecoverDersleri.Ders02;

import java.util.Scanner;

public class C05_FizzBuzz {

    public static void main(String[] args) {

        /*
            Kullanicidan pozitif bir tamsayi alin
            sayi 3 ile bolunebiliyorsa "Fizz"
            sayi 5 ile bolunebiliyorsa "Buzz"
            sayi hem 3, hem 5 ile bolunebiliyorsa "FizzBuzz" yazdirin
            kullanici 0 veya negatif deger girerse hata mesaji verin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (sayi<=0) {
            System.out.println("Girilen sayi pozitif olmalidir");
        } else if ( sayi % 3 == 0  && sayi % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (sayi % 3 == 0 ) {
            System.out.println("Fizz");
        } else if (sayi % 5 == 0) {
            System.out.println("Buzz");
        }

        // else ile bitmedigi icin bazi degerler girildiginde bir sonuc vermez
    }
}
