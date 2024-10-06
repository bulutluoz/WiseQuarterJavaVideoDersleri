package RecoverDersleri.ders03;

import java.util.Scanner;

public class C02_IsimDuzenleme {

    public static void main(String[] args) {

        // kullanicidan isim ve soyismini alin

        // kullaniciya tercihini sorun
        // 1- Isim ve soyisim ilk harfleri buyuk, kalan harfler kucuk
        // 2- Ismin ilk harfi buyuk, kalanlar kucuk, soyismin tamami buyuk harf
        // 3- Ismin ve soyismin ilk harfi buyuk harf olarak gorunsun kalan harfler * olsun
        // 4- Sadece ismin ilk harfi buyuk harf olarak gorunsun kalan yildiz olsun
        // kullanicinin tercihine gore ismi duzenleyip, kaydedin
        // ve kaydedilen son halini kullaniciya yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Isminizi kaydetmek istediginiz sekil icin tercihinizi giriniz..."+
                            "\n1- Isim ve soyisim ilk harfleri buyuk, kalan harfler kucuk" +
                            "\n2- Ismin ilk harfi buyuk, kalanlar kucuk, soyismin tamami buyuk harf" +
                            "\n3- Ismin ve soyismin ilk harfi buyuk harf olarak gorunsun kalan harfler * olsun" +
                            "\n4- Sadece ismin ilk harfi buyuk harf olarak gorunsun kalan yildiz olsun");

        int tercih = scanner.nextInt();

        String kaydedilenIsim = "";

        switch (tercih){

            case 1:
                //Isim ve soyisim ilk harfleri buyuk, kalan harfler kucuk

                kaydedilenIsim = isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).toLowerCase()+
                                 " "+
                                 soyisim.substring(0,1).toUpperCase()+
                                 soyisim.substring(1).toLowerCase()   ;
                break;
            case 2 :
                // Ismin ilk harfi buyuk, kalanlar kucuk, soyismin tamami buyuk harf

                kaydedilenIsim = isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).toLowerCase()+
                                 " "+
                                 soyisim.toUpperCase();

                break;
            case 3 :
                // Ismin ve soyismin ilk harfi buyuk harf olarak gorunsun kalan harfler * olsun
                kaydedilenIsim = isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).replaceAll("\\w","*")+
                                 " "+
                                 soyisim.substring(0,1).toUpperCase()+
                                 soyisim.substring(1).replaceAll("\\w","*") ;

                break;
            case 4 :
                // Sadece ismin ilk harfi buyuk harf olarak gorunsun kalan yildiz olsun
                kaydedilenIsim = isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).replaceAll("\\w","*")+
                                 " "+
                                 soyisim.replaceAll("\\w","*");

                break;
            default:
                kaydedilenIsim = isim+ " "+soyisim;

        }

        System.out.println("Tercihiniz uzere isminiz su sekilde kaydedildi : " + kaydedilenIsim);

    }
}
