package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));


        System.out.println(sayilar); // [4, 6, 1, 9, 3]

        // sayilar listesinde 2.index'deki elementi 5 yapin

        System.out.println(sayilar.set(2, 5)); // 1


        System.out.println(sayilar); // [4, 6, 5, 9, 3]



        /*
              asil isi 2.index'deki elementi 5 yapmak
              asil isini yapti, delil olarak eski elementi getirdi
         */


        System.out.println(isimler); // [Ali, Veli, Cemil, Ayse, Fatma, Hatice]

        // Isimler listesinden Ali'yi silin

        System.out.println(isimler.remove("Ali")); // true

        // Isimler listesinden Mert'i silin

        System.out.println(isimler.remove("Mert"));// false


        System.out.println(isimler); // [Veli, Cemil, Ayse, Fatma, Hatice]




        // Isimler listesinden 2. index'deki elementi silin

        System.out.println(isimler.remove(2)); // Ayse


        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]



        System.out.println(sayilar); // [4, 6, 5, 9, 3]

        // sayilar listesinden 3. index'deki elementi silin

        System.out.println(sayilar.remove(3)); // 9

        System.out.println(sayilar); // [4, 6, 5, 3]


        // sayilar listesinden 4'u silin

        Integer silinecekSayi = 4;

        System.out.println(sayilar.remove(silinecekSayi)); // true


        System.out.println(sayilar); // [6, 5, 3]

    }
}
