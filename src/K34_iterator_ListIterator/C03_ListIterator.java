package K34_iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(4, 6, 7, 2, 3, 5, 6));
        // INDEX kullanmadan sayilar listesindeki sayilari
        // 1'er artirin

        ListIterator listIterator = sayilar.listIterator();
        System.out.println("Artirmadan once sayilar : " + sayilar);
        // Artirmadan once sayilar : [4, 6, 7, 2, 3, 5, 6]

        while (listIterator.hasNext()){

             Integer eskiDeger = (Integer) listIterator.next();
             listIterator.set(eskiDeger+1);

        }

        System.out.println("Artirmadan sonra sayilar : " + sayilar);
        // Artirmadan sonra sayilar : [5, 7, 8, 3, 4, 6, 7]

        // sayilar listesindeki sayilari
        // INDEX kullanmadan sondan basa dogru yazdirin
        /*
         ITERATOR ile calistigimizda ilk sormamiz gereken soru
         ITERATOR NEREDE ?
         bu soru icin ITERATOR su an en sonda
         */


        while (listIterator.hasPrevious()){

            System.out.print(listIterator.previous() + " ");
        } // 7 6 4 3 8 7 5

        System.out.println("");

        System.out.println("Tersten eleman yazdirdiktan sonra sayilar : " + sayilar);
        // Tersten eleman yazdirdiktan sonra sayilar : [5, 7, 8, 3, 4, 6, 7]


        // INDEX KULLANMADAN sayilar listesindeki cift sayilari silin
        // ITERATOR NEREDE ? su an en basta


        while (listIterator.hasNext()){

            if (  (Integer)listIterator.next()  % 2 == 0  ){

                listIterator.remove();
            }
        }

        System.out.println("Cift sayilari sildikten sonra sayilar : " + sayilar);
        // Cift sayilari sildikten sonra sayilar : [5, 7, 3, 7]


    }
}
