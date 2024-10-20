package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]

        int[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};


        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if ( ! tekrarsizList.contains(arr[i]) ){

                tekrarsizList.add( arr[i] );
            }
        }


        System.out.println("tekrarsiz liste : " + tekrarsizList); // [2, 3, 4, 5, 1]

        Collections.sort(tekrarsizList);


        System.out.println(Arrays.toString(arr));  // [2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1]


        /*
            Biz tekrarsiz elementleri TEKRARSIZ LISTEYE koyduk

            Gorev array'i tekrarsiz hale getirmemizi soyluyor

            array'in uzunlugunu degistiremeyecegimiz icin
            array'e yeni bir deger atamaliyiz
         */


        arr = new int[tekrarsizList.size()];  // [0, 0, 0, 0, 0]


        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);

        }


        System.out.println("Array'in tekrarsiz hali : " + Arrays.toString(arr));

        // Array'in tekrarsiz hali : [1, 2, 3, 4, 5]

    }
}
