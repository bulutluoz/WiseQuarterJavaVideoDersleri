package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_VerilenArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,5,6,7,8,9,2,3,5,3,4,6,2,7};

        // arr array'ini bir list olarak kaydedin

        // bos bir list olusturup
        // for loop ile array'deki elementleri listeye ekleyin

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.add(10);
        sayilar.add(20);
        sayilar.remove(0);
        sayilar.remove(0);

        System.out.println("For loop ile olusan liste : " + sayilar); // [6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7, 10, 20]




        /*
            Arrays class'inda bu isi yapan hazir asList() method'u var
            ANNCAKKK bu method'un 2 tane olumsuz yan etkisi var
            bu sebeple cok tercih edilmez

            1- arrays class'i kullanildigi icin ekleme ve remove'a izin vermez
            2- arry'e yapilan atamalar list'e,
               list'e yapilan atamalar da arr'ye islenir
         */


        // arr ==> {3,5,6,7,8,9,2,3,5,3,4,6,2,7};

        List<Integer> yeniList = Arrays.asList(arr);

        System.out.println(yeniList); // [3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]


        // yeniList.add(10); // UnsupportedOperationException

        // yeniList.remove(0); // UnsupportedOperationException

        arr[0] =10;
        arr[1] = 20;

        System.out.println("Array'e atama yaptiktan sonra liste : " + yeniList); //

        // Array'e atama yaptiktan sonra liste : [10, 20, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]
    }
}
