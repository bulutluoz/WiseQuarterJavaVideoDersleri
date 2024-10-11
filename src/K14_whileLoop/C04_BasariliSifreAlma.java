package K14_whileLoop;

import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C07_SifreKontrol;

import java.util.Scanner;

public class C04_BasariliSifreAlma {

    public static void main(String[] args) {

        // daha once yaptigimiz sifre kontrolu method'unu kullanarak
        // kullanici hatasiz bir sifre girinceye kadar tekrar tekrar sifre isteyin
        // kabul edilebilir bir sifre girdiginde "Sifreniz basarili olarak kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);

        boolean tekrarSorayimMi = true ;
        String girilenSifre = "";

        while ( tekrarSorayimMi  ){

            System.out.println("Lutfen sifrenizi giriniz...");

            girilenSifre = scanner.nextLine();

            tekrarSorayimMi = ! C07_SifreKontrol.sifreGecerliMi(girilenSifre);

        }

        System.out.println("Sifreniz basarili olarak kaydedildi");


    }


}
