package K13_methodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

import java.util.Scanner;

public class C08_DogruSifreAlma {

    public static void main(String[] args) {


        // Kullanicidan bir sifre isteyin
        // C07'daki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin

        Scanner scanner = new Scanner(System.in);

        String sifre = "";
        boolean sifreGecerliMi = false;


        for (int i = 1; i <10000 ; i++) {

            System.out.println("Lutfen sifrenizi giriniz...");
            sifre = scanner.nextLine();

            // sifrenin gecerli olup olmadigini kontrol edip
            // sonucunu kaydedelim

            sifreGecerliMi = C07_SifreKontrol.sifreGecerliMi(sifre);

            if (sifreGecerliMi == true){
                System.out.println( i  + " denemede gecerli sifre girdiniz.");
                break;
            }

        }







    }
}
