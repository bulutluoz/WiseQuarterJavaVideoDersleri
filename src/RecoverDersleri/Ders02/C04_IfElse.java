package RecoverDersleri.Ders02;

import java.util.Scanner;

public class C04_IfElse {

    public static void main(String[] args) {

        /*
            Kullanicidan  yasini ve kilosunu alaliniz
            18 yasindan kucuk ise kan bagisi yapamaz
            18 yas veya daha buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
            18 yas veya daha buyuk ve 50 kilo veya daha agir ise kan bagisi yapabilir.
            Kullanici yas veya kilo icin negatif deger giremez
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        System.out.println("Lutfen kilonuzu giriniz...");
        double kilo = scanner.nextDouble();

        // iki degiskene gore karar vermemiz gerekiyor
        // nested if else daha kullanisli olur


        // yas ana degisken olsun

        if (yas < 0){
            System.out.println("Yas sifirdan kucuk olamaz");

        } else if (yas<18) {
            System.out.println("18 yasindan kucukler kan bagisi yapamaz");

        }else{ // burasi 18 veya daha buyuk olanlarin bolgesi, kilo kontrolu yapmaliyiz

            if (kilo<0){
                System.out.println("Kilo degeri negatif olamaz");
            } else if (kilo<50) {
                System.out.println("50 kg'dan hafif olanlar kan veremez");
            } else{
                System.out.println("18 yasini dolduranlardan, 50 kilo ve daha agir olanlar kan verebilir");
            }


        }


    }
}
