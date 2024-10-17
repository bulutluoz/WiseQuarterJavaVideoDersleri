package K17_arrays.D02_arraysClassMethodlari;

import java.util.Arrays;

public class C01_sort {

    public static void main(String[] args) {


        String[] isimler = {"Metin","Mete","metehan","Mikail","Nevzat","Yasar","yakup","Yaman"};


        // array'i natural order'a gore duzenleyip (dogal siralama) yazdirin


        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));
        //  [Mete, Metin, Mikail, Nevzat, Yaman, Yasar, metehan, yakup]

        /*
            NOT 1 : Natural order sayilar icin kucukten buyuge,
                    metinler icin ise sozluk siralamasina gore siralama demektir
                    ANCAKKK java'nin case sensitive oldugunu ve
                    kucuk harflerin buyuk harflerden sonra geldigini UNUTMAMALIYIZ
         */

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        str = str.toLowerCase();

        System.out.println(str); // java candir


        /*
            NOT 2 : String'de method ile yapilan degisiklikler atama olmazsa KALICI degisiklik olmaz
                    ANCAKKK bu kural tum non-primitive'ler icin gecerli degildir.
                    (ilerde bu konu detayli anlatilacak)
                    array ve arrayList'de method ile yapilan degisiklikler KALICI OLUR
         */


    }
}
