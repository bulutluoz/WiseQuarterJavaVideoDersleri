package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //        asagidaki formatta yazdirin.
        //		    Isminiz : John
        //		    Soyisminiz : Doe
        //		    Yasiniz : 44
        //		    Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        // String isim = scanner.next();
        // kullanicinin girdigi bilginin ILK KELIMESINI
        // (ilk space'e kadar olan kismini) alir

        String isim = scanner.nextLine();
        // kullanicinin girdigi bilginin tamamini alir

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        //		    Isminiz : John
        //		    Soyisminiz : Doe
        //		    Yasiniz : 44
        //		    Kaydiniz basariyla tamamlanmistir.

        System.out.println(
               "Isminiz : " +  isim +
               "\nSoyisminiz : " +  soyisim +
               "\nYasiniz : " + yas +
               "\nKaydiniz basariyla tamamlanmistir."
        );











    }
}
