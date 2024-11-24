package K36_maps.D05_nestedMapOlusturma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();


//        sayilar.add(12);
//        sayilar.add("Ali");
//        sayilar.add('k');
//        sayilar.add(true);
//
//        Integer[] arr = {4,5,6,8};
//
//        sayilar.add(arr);

        List<Object> herseyList = new ArrayList<>();

        herseyList.add(12);
        herseyList.add("Ali");
        herseyList.add('k');
        herseyList.add(true);

        Integer[] arr = {4,5,6,8};
        herseyList.add(arr);

        List<String> isimler = new ArrayList<>(Arrays.asList("Hilal","Gulay","Senol","Aysegul"));
        herseyList.add(isimler);

        /*
         sayilar listesi deklare edilirken Integer'lardan olusacagi soylendigi icin
         Integer olmayan hic bir datayi ekleyemeyiz

         Bir listeye herseyi eklemek KOLAYLIK gibi gorunse de
         elemanlara ulasma ve kullanma acisindan zorluk olusturabilir
         */

        System.out.println(herseyList);
        // [12, Ali, k, true, [Ljava.lang.Integer;@1cd072a9, [Hilal, Gulay, Senol, Aysegul]]


        // 0.index'deki sayinin 2 katini yazdirin

        System.out.println( (Integer) herseyList.get(0) * 2  );  // 24

        // System.out.println( (Integer) herseyList.get(1) * 2  );  // (Integer)"Ali" * 2   ClassCastException



        // 1.index'deki String'in length'ini yazdirin

        System.out.println(((String) herseyList.get(1)).length()); // 3


        // 4.indexdeki array'i yazdirin
        System.out.println(  Arrays.toString((Integer[]) herseyList.get(4)) );  // [4, 5, 6, 8]



        // 4.index'deki array'in length'ini yazdirin

        System.out.println(((Integer[]) herseyList.get(4)).length); // 4


    }
}
