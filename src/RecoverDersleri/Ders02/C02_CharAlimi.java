package RecoverDersleri.Ders02;

import java.util.Scanner;

public class C02_CharAlimi {

    public static void main(String[] args) {

        // kart var mi?

        Scanner scanner = new Scanner(System.in);

        System.out.println("isminizi giriniz...");
        String isim = scanner.nextLine();


        System.out.println("Kartiniz var mi ?  E: Evet H: Hayir");
        char kartVarMi = scanner.nextLine().charAt(0);


        System.out.println(kartVarMi);
        System.out.println(isim);
    }
}
