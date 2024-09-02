package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C04_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        //        asagidaki formatta yazdirin.
        //		  girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        //		  girilen bilgiler : J Doe, 44

        System.out.println(

            "girilen bilgiler : " + isim.charAt(0) + " " +
             soyisim + ", " + yas
        );

    }
}
