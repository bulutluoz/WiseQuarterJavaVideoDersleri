package K12_forLoop.D01_ForLoop;

import java.util.Scanner;

public class C03_AradakiSayilarinToplami {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degeri olarak pozitif tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("bitis degeri olarak pozitif tamsayi giriniz...");
        int bitis = scanner.nextInt();


        int toplam = 0;

        if (bitis < baslangic){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz...");
        } else {

            for (int i = baslangic; i <= bitis ; i++) {

                toplam += i;
            }

        }

        System.out.println(baslangic + " ile "+ bitis + " sayilari dahil olarak aralarindaki tamsayilarin toplami : " + toplam);

    }


}
