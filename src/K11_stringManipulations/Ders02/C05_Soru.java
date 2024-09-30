package K11_stringManipulations.Ders02;

import java.util.Scanner;

public class C05_Soru {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metin ev iceriyorsa "Ev gibisi var mi?",
        // metin is iceriyorsa "Calismak ne guzel",
        // metin hem ev hem is iceriyorsa "Evden calismak gibisi yok"
        // metin bu iki kelimeyi de icermiyorsa "Cok calismak lazim, coook" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine().toLowerCase();

        if (metin.contains("ev") && metin.contains("is")) {
            System.out.println("Evden calismak gibisi yok");
        } else if(metin.contains("is")){
            System.out.println("Calismak ne guzel");
        } else  if (metin.contains("ev")){
            System.out.println("Ev gibisi var mi?");
        }else {
            System.out.println("Cok calismak lazim, coook");
        }


    }
}
