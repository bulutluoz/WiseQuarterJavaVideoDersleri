package K34_iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        int[] arr = {3,5,6,1,2,4,5};

        // arr'in tum elementlerini 1'er artirin

//        for (int i = 0; i < arr.length ; i++) {
//
//            arr[i] +=1;
//
//        }
//        System.out.println(Arrays.toString(arr)); // [4, 6, 7, 2, 3, 5, 6]


        // arr'in tum elemanlarini INDEX KULLANMADAN 2 artirin

        for (int each  : arr){

            System.out.print((each +=2) + " ");

        } // 5 7 8 3 4 6 7

        System.out.println("");

        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 1, 2, 4, 5]

        /*
         INDEX kullanmadan array'deki tum elemanlari
         for-each loop ile elden gecirebiliriz
         ANCAKKK for-each loop ile kalici degisiklik yapamayiz
         */

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(5, 6, 7));
        // INDEX kullanmadan sayilar listesindeki tek sayilari silin

        /*
         JAVA index kullanmadan bir listedeki tum elemanlari
         gozden gecirebilmemiz icin Iterator ve ListIterator interface'lerini olusturmustur
         */

        // [   5,    6,    7  ]

        Iterator itr = sayilar.iterator();

        System.out.println(itr.hasNext()); // true
        //System.out.println(itr.next()); // itr.next() nerede calistirilirsa calistirilsin, yandaki sayinin onune gider
                                          // uzerinden gectigi sayiyi icine alir

        if (  (Integer) itr.next() % 2 != 0 ){
                itr.remove();
        }

        if (  (Integer) itr.next() % 2 != 0 ){
            itr.remove();
        }

        if (  (Integer) itr.next() % 2 != 0 ){
            itr.remove();
        }


        System.out.println(sayilar); // [6]









    }
}
