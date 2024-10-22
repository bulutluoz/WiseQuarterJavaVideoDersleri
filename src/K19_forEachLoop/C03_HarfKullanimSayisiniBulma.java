package K19_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C03_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();
        // java bizi dusunur

        System.out.println("Lutfen aranacak harfi giriniz...");
        String aranacakHarf = scanner.nextLine().substring(0,1);

        String[] karakterlerArr = cumle.split("");
        // [j, a, v, a,  , b, i, z, i,  , d, u, s, u, n, u, r]

        int sayac = 0;

        for ( String each  :karakterlerArr){

            if (each.equals(aranacakHarf)) sayac++ ;
        }

        if (sayac == 0) System.out.println("harf cumlede kullanilmamis");
        else System.out.println("Aranan " + aranacakHarf + " harfi cumlede "+ sayac + " defa kullanilmis.");



    }
}
