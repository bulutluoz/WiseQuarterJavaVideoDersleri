package K35_collections.D02_Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C02_TekrarlariSilme {

    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elementleri silip
        // array'i her elementin sadece 1 tane oldugu hale donusturen
        // ve bize donduren bir method olusturun

        int[] sayilar = {2,4,5,4,3,5,6,7,3,2,4,5,8,2,3,4,5,1,2,3};

        sayilar = arrayiTekrarsizYap(sayilar);
        System.out.println("sayilar array'inin son hali : " + Arrays.toString(sayilar));
        // sayilar array'inin son hali : [1, 2, 3, 4, 5, 6, 7, 8]



        int[] arr = {3,3,3,3,3,3,5,5,5,5,5,5,77,5,77,77,3};

        arr = arrayiTekrarsizYap(arr);

        System.out.println("arr'nin son hali : " + Arrays.toString(arr)); // arr'nin son hali : [3, 5, 77]



    }


    // verilen bir array'de tekrar eden elementleri silip
    // array'i her elementin sadece 1 tane oldugu hale donusturen
    // ve bize donduren bir method olusturun

    public static int[] arrayiTekrarsizYap(int[] sayilar){

        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (  int each   :sayilar){

            tekrarsizSet.add(each);

        }

        // System.out.println("tekrarsizSet'in son hali : " + tekrarsizSet);
        // tekrarsizSet'in son hali : [1, 2, 3, 4, 5, 6, 7, 8]

        // Bizden istenen elementleri bir Set olarak elde ettik
        // bize gorevde sayilar array'ini bu hale getirmemiz soyleniyor
        // o zaman array'i tekrarsizSet'deki elemanlardan olusan hale donusturelim

        sayilar = new int[tekrarsizSet.size()];  // [0, 0, 0, 0, 0, 0, 0, 0]

        int index=0;
        for( int each  :tekrarsizSet){

            sayilar[index] = each;
            index++;
        }


        return sayilar;

    }



}
