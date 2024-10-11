package K11_stringManipulations.D01_charAt_length_equals;

import java.util.Scanner;

public class C05_SifreKontrolu {

    public static void main(String[] args) {

        // Kullanicidan sifre olusturmak uzere sifre isteyin.
        // Sifreyi iki kere isteyin
        // eger metin ayni oldugu halde yazim farkliligi varsa
        // "Lutfen yazimi kontrol edin" yazdirin
        // Eger karakter farkliligi varsa
        // "Girilen sifreler farkli" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz sifreyi giriniz...");
        String sifre1 = scanner.nextLine();

        System.out.println("Lutfen sifreyi tekrar giriniz...");
        String sifre2 = scanner.nextLine();


        if (sifre1.equalsIgnoreCase(sifre2)){
            System.out.println("Lutfen yazimi kontrol edin");

        }else  System.out.println("Girilen sifreler farkli");

    }
}
