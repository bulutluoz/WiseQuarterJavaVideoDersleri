package K36_maps.D02_BilgilereUlasmaVeListeleme;

import java.util.Map;
import java.util.Set;

public class C03_SubeListesiYazdirma extends OgrenciMap{

    public static void main(String[] args) {

        // sinif ve sube verildiginde
        // o siniftaki ogrencilerin
        // numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun

        Integer istenenSinif = 10;
        String istenenSube = "K";

        /*
            {
               101=Ali-Can-11-H-MF,
               102=Veli-Cem-10-K-TM,
               103=Ali-Cem-11-K-TM,
               104=Ayse-Can-10-H-MF,
               105=Sevgi-Cem-11-M-TM,
               106=Sevgi-Can-10-K-MF,
               107=Esra-Han-11-M-SOZ
               }
         */

        ogrenciMap.keySet();

//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir

//            2- bir for-each loop ile her bir key'i ele alalim

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin


//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        //  [101, 102, 103, 104, 105, 106, 107]

//            2- bir for-each loop ile her bir key'i ele alalim

        System.out.println(istenenSinif +"/"+istenenSube + " subesindeki ogrenci listesi");

        for (Integer eachKey : ogrenciKeySeti){
            // eachKey ==> 101

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin

            // numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun
            if (eachValueArr[2].equalsIgnoreCase(istenenSinif+"")
                    && eachValueArr[3].equalsIgnoreCase(istenenSube) ){

                System.out.println(
                        eachKey + " " +
                        eachValueArr[0]+ " " +
                        eachValueArr[1]

                );
            }



        }




    }
}
