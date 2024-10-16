package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C04_TumElementleriKullanma {

    public static void main(String[] args) {

        int[] sayilar = {4,7,1,3,4,8,0,1};

        // sayilar array'ini yazdirin
        System.out.println(Arrays.toString(sayilar)); // [4, 7, 1, 3, 4, 8, 0, 1]

        // sayilar array'inin tum elementlerini yan yana yazdirin

        for (int i = 0; i < sayilar.length ; i++) {

            System.out.print( sayilar[i] +" ");

        } // 4 7 1 3 4 8 0 1
        System.out.println("");
        /*
            EGER bir array'in tum elementleri ile
            istenen bir islem yapacaksak
            for loop kullaniriz
         */

        // [4, 7, 1, 3, 4, 8, 0, 1]

        // sayilar array'indeki tum elementlerin toplamini yazdirin
        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];

        }

        System.out.println("Sayilar array'indeki elementlerin toplami : " + toplam); // 28


        // sayilar array'indeki cift sayilarin carpimini yazdirin

        int carpim = 1;

        for (int i = 0; i < sayilar.length ; i++) {

            if ( sayilar[i] % 2 == 0 ){

                carpim *= sayilar[i];
            }

        }

        System.out.println("Sayilar array'indeki cift elementlerin carpimi : " + carpim); // 0







    }
}
