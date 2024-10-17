package K17_arrays.D02_arraysClassMethodlari;

import K17_arrays.D01_arrayOlusturmaVeKullanma.C07_ElemanArama;

import java.util.Arrays;

public class C02_binarySearch {

    public static void main(String[] args) {

        String[] harfler = {"d","t","p","k","z"};

        // verilen arr'de a harfinin var olup olmadigini yazdirin

        C07_ElemanArama.elemanArama(harfler,"a"); // istenen harf array'de yok
        C07_ElemanArama.elemanArama(harfler,"t"); // Istenen harf array'de 1 defa kullanilmis


        System.out.println(Arrays.binarySearch(harfler, "d")); // 0
        System.out.println(Arrays.binarySearch(harfler, "t")); // -5
        System.out.println(Arrays.binarySearch(harfler, "p")); // 2
        System.out.println(Arrays.binarySearch(harfler, "k")); // -2
        System.out.println(Arrays.binarySearch(harfler, "z")); // 4
        System.out.println(Arrays.binarySearch(harfler, "a")); // -1
        System.out.println(Arrays.binarySearch(harfler, "x")); // -5


        /*
            Arrays.binarySearch() bir array'de aranan elementin
            hangi index'de oldugunu verir

            ANCAKKKK bu method'dan once sort() calistirilmalidir

            sort() calistirilmadan yapilan aramalarda
            SONUC BILINEMEZ
         */

        Arrays.sort(harfler);

        // eski siralama                               {"d","t","p","k","z"};
        System.out.println(Arrays.toString(harfler)); // [d, k, p, t, z]

        System.out.println(Arrays.binarySearch(harfler, "d")); // 0
        System.out.println(Arrays.binarySearch(harfler, "t")); // 3
        System.out.println(Arrays.binarySearch(harfler, "p")); // 2
        System.out.println(Arrays.binarySearch(harfler, "k")); // 1
        System.out.println(Arrays.binarySearch(harfler, "z")); // 4
        System.out.println(Arrays.binarySearch(harfler, "a")); // -1
        System.out.println(Arrays.binarySearch(harfler, "x")); // -5


        /*
            olmayan elementler icin index degil sira kullanilir
            index'de 0 oldugu icin -0 anlamsiz olur

            ornegin a icin artip index olsaydi
            -0 derdi ==> 0 yazardi
         */


    }
}
