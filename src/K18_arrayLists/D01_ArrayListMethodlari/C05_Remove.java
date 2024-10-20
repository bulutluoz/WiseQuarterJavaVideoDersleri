package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));



        // isimler listesinden Ali'yi silin
        isimler.remove("Ali");

        System.out.println(isimler); // [Veli, Cemil, Ayse, Fatma, Hatice]

        // isimler listesinden 2.index'deki elementi silin

        isimler.remove(2);

        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]


        /*
            Eger list sayilardan olusuyorsa
            Java girilen degeri direkt index olarak alir,
            Eger sayi olan 4'u silmek isterseniz
            bunu once object(non-primitive) olarak olusturmalisiniz
         */

        System.out.println(sayilar); // [4, 6, 1, 9, 3]

        // sayilar listesinden 1'i silin

        sayilar.remove(1);

        System.out.println(sayilar); //  [4, 1, 9, 3]


        // sayilar listesinden 9'u silin

        // sayilar.remove(9);
        // IndexOutOfBoundsException: Index 9 out of bounds for length 4


        Integer silinecekSayi = 9;


        sayilar.remove(silinecekSayi);


        System.out.println(sayilar); // [4, 1, 3]






    }
}
