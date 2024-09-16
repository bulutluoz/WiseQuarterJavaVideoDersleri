package K08_IfElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri_SayacYontemi {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        // girilen sayi1 ve sayi2 icin asagidaki sartlari kontrol edin
        // ve hic bir sarti saglamiyorsa "sayilar uygun degil" yazdirin
        // eger sayilar tum sartlari saglarsa "sayilar mukemmel" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sayac = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2) {
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0) {
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50) {
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2%5==0) {
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }


        // 5- EGER hic bir if body'si calismadiysa "sayilar uygun degil" yazdirin

        if (sayac == 0) System.out.println("sayilar uygun degil");

        // 6- EGER sayilar tum sartlari saglarsa "sayilar mukemmel" yazdirin
        if (sayac == 4) System.out.println("sayilar mukemmel");

    }
}
