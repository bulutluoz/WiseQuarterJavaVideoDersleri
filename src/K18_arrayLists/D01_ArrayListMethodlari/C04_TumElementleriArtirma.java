package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArtirma {

    public static void main(String[] args) {




        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));
        // sayilar listesindeki tum elementleri 4 artirin


        System.out.println(elementleriArtir(sayilar, 4)); // [8, 10, 5, 13, 7]


        for (int i = 0; i < sayilar.size() ; i++) {

            int eskiDeger= sayilar.get(i);

            sayilar.set(i, eskiDeger+4);

        }

        System.out.println(sayilar); // [12, 14, 9, 17, 11]






    }


    // verilen Integer bir listedeki tum elementleri
    // istenen bir deger kadar artirip listenin son halini donduren
    // bir method olusturun.

    public static List<Integer> elementleriArtir (List<Integer> sayilar, int artisMiktari){

        for (int i = 0; i < sayilar.size() ; i++) {

            int eskiDeger= sayilar.get(i);

            sayilar.set(i, eskiDeger+ artisMiktari);

        }

        return sayilar;

    }



}
