package K17_arrays.D02_arraysClassMethodlari;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        int[] sayilar = {3,5,10};

        String[] isimler = {"Ali", "Hasan"};

        // sayilar array'ine 4.deger olarak 8 ekleyin
        // sayilar[3] = 8; // ArrayIndexOutOfBoundsException



        // isimler array'ine 3.deger olarak "Can" ekleyin



        // sayilar array'ine {3, 5, 6, 8} array'ini atayin
        // sayilar = {3, 5, 6, 8} ;

        int[] arr = {3, 5, 6, 8};
        sayilar = arr;

        System.out.println("Sayilar array'inin son hali : " + Arrays.toString(sayilar)); // [3, 5, 6, 8]


        // isimler array'ine {"Ali", "Veli", "Can"} array'ini atayin

        String[] yeniArr = new String[3]; // [null, null, null]
        yeniArr[0] = isimler[0];
        yeniArr[1] = isimler[1];
        yeniArr[2] = "Can";

        isimler = yeniArr;

        System.out.println("Isimler array'inin son hali : " + Arrays.toString(isimler));
        // [Ali, Veli, Can]






    }
}
