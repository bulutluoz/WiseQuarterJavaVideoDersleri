package K09_ternaryOperator;

import java.util.Scanner;

public class C02_IfElse_Ternary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi 100'den buyukse sayiyi 10 azaltin
        // sayi 100'den buyuk degilse sayiya 20 ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        // if-else ile yapalim


        if (sayi > 100 ){
            sayi-=10;
        }else {
            sayi += 20;
        }


        // ternary ile yapalim

        sayi = sayi >100 ? sayi-10 : sayi+20;

        System.out.println(sayi);
    }
}
