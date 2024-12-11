package K10_switchStatements;

import java.util.Scanner;

public class C01_SwitchCaseKullanimi {

    public static void main(String[] args) {


        // kullaniciya haftanin kacinci gununu yazdirmak istedigini sorun
        // 1-7 arasindaki degerler icin pazartesi'den pazar'a kadar gun isimlerini yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girerse hata mesaji verin

          /*
            switch(kontrolEdilecekVariable) {  }
            Java kontrolEdilecekVariable'in degerine
            uygun olan case'den calismaya baslar

            ve switch statement'in sonuna kadar calisir

            EGER case'lerin birbirinden bagimsiz olmasini isterseniz
            her case'in bitimine break; yazmaliyiz

            EGER kullanici case olarak belirlenen degerlerin disinda
            ne deger girerse girsin
            standart bir islem yapmasini istersek
            default :  ile bu islemi tanimlayabiliriz
             */
        Scanner scanner = new Scanner(System.in);
        System.out.println("haftanin kacinci gununu yazdirmak istersiniz ?");
        int gunNo = scanner.nextInt();


        switch (gunNo){

            case 1 : // gunNo == 1 oldugu durumda calisacak kodlar
                System.out.println("pazartesi");
                break;
            case 2 : // gunNo 2 oldugunda calisacak kodlar
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("Girilen gun numarasi hatali");

        }

    }
}
