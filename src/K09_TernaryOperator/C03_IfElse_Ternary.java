package K09_TernaryOperator;

import java.util.Scanner;

public class C03_IfElse_Ternary {

    public static void main(String[] args) {

        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen 3 basamakli bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi >= 500){ // 623
            //rakamlar toplamini hesaplayip yazdirin
            int rakamlarToplami = 0;
            int birlerBasamagi = 0;

            rakamlarToplami += sayi % 10;
            sayi /= 10; // 62

            rakamlarToplami += sayi%10;
            sayi /=10; // 6

            rakamlarToplami += sayi;

            System.out.println("Rakamlar toplami : " + rakamlarToplami);


        }else { // 234
            // sayinin 10'lar basamagindaki rakamin karesini yazdirin

            sayi /= 10 ; // 23

            int onlarBasamagindakiRakam = sayi % 10; // 3

            System.out.println("Onlar basamagindaki rakamin karesi : " + onlarBasamagindakiRakam * onlarBasamagindakiRakam);

        }





    }
}
