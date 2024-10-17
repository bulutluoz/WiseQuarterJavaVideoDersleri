package K17_arrays.D02_arraysClassMethodlari;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        int[] sayilar = {3,5,10};

        String[] isimler = {"Kemal", "Hasan"};

        // sayilar array'ine 4.deger olarak 8 ekleyin

        // sayilar[3] = 8;  // ArrayIndexOutOfBoundsException


        // isimler array'ine 3.deger olarak "Can" ekleyin



        // sayilar array'ine {3, 5, 10, 8} array'ini atayin

        // sayilar = {3, 5, 10, 8} ;

        int[] sayilarYeni = {3, 5, 10, 8};

        sayilar = sayilarYeni;

        System.out.println("sayilar array'inin son hali : "+ Arrays.toString(sayilar));
        // sayilar array'inin son hali : [3, 5, 10, 8]


        //  isimler = {"Ali", "Hasan"};
        // isimler array'ine {"Ali", "Hasan", "Can"} array'ini atayin

        String[] isimlerYeni = new String[isimler.length + 1  ]; // [null, null, null]

        isimlerYeni[0] = isimler[0]; // [Ali, null, null]

        isimlerYeni[1] = isimler[1];  // [Ali, Hasan, null]

        isimlerYeni[2] = "Can";

        isimler = isimlerYeni;

        System.out.println("isimler array'inin son hali : "+ Arrays.toString(isimler));

        //isimler array'inin son hali : [Ali, Hasan, Can]









    }
}
