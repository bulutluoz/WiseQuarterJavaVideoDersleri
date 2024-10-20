package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_IstenmeyenElementleriSilme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        System.out.println(istenmeyenElementleriSil(isimler, "e")); // [Ali, Fatma]


//        // isimler listesinde "e" harfi iceren elementleri silin
//
//        System.out.println(isimler); // [Ali, Veli, Cemil, Ayse, Fatma, Hatice]
//
//
//        for (int i = 0; i < isimler.size() ; i++) {
//
//            if ( isimler.get(i).contains("e") ){
//
//                isimler.remove(isimler.get(i));
//                i--;
//            }
//
//        }
//
//
//        System.out.println(isimler); // [Ali, Fatma]



    }


    //Soru 3- Verilen String bir listede
    //        istenmeyen harf iceren elementleri silip,
    //        kalan kismini list olarak bize donduren bir method olusturun

    public static List<String> istenmeyenElementleriSil (List<String> isimler , String istenmeyenHarf){

        for (int i = 0; i < isimler.size() ; i++) {

            if ( isimler.get(i).contains(istenmeyenHarf) ){

                isimler.remove(isimler.get(i));
                i--;
            }

        }

        return isimler;
    }




}
