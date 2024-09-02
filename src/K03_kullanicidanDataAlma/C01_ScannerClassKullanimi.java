package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz...");

        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz...");

        int tamsayi = scanner.nextInt();

        System.out.println( "Sayilarin toplami : " +  (ondalikliSayi + tamsayi)   );
        System.out.println( "Sayilarin carpimi : " +  (ondalikliSayi * tamsayi)   );
    }
}
