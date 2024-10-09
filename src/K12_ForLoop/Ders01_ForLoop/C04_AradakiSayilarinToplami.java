package K12_ForLoop.Ders01_ForLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {

    public static void main(String[] args) {

        //  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //  Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degeri olarak pozitif tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("bitis degeri olarak pozitif tamsayi giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (baslangic < bitis ){

            for (int i = baslangic; i <= bitis ; i++) {

                toplam += i;
            }
        }else {

            for (int i = baslangic; i >= bitis ; i-- ) {

                toplam += i;
            }


        }

        System.out.println(baslangic + " ile "+ bitis + " sayilari dahil olarak aralarindaki tamsayilarin toplami : " + toplam);


    }

}
