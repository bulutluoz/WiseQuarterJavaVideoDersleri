package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            BAGIMSIZ if cumleleri adindan da anlasilacagi gibi
            kodun geri kalanindan bagimsizdir

            Kendisine verilen sarta odaklanir
            ve o sart true olursa if body'sine yazilan kodu calistirir

            Birden fazla bagimsiz if cumlesi varsa
            hepsinin if body'leri calisabilecegi gibi
            hic birinin if body'si calismayabilir de

            Bu kod calistirildiginda
            tum bagimsiz if cumleleri kendi sartlarini kontrol eder
            sart saglanirsa kendi body'sindeki kodlari calistirir
            sart saglanmazsa if cumlesi calisir
            ama if body'si devreye girmemis olur
         */

        // kullanicidan 2 tam sayi alin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin

    }
}
