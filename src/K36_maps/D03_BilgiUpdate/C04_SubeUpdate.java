package K36_maps.D03_BilgiUpdate;


import K36_maps.D02_BilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Set;

public class C04_SubeUpdate extends OgrenciMap {

    public static void main(String[] args) {

        // 10/K sinifindaki ogrencilerin subelerini Z yapin

        Integer sinif = 10;
        String eskiSube = "K";
        String yeniSube = "Z";

        // Key olmadan update yapamayacagimiz icin
        // Yola value collection'i ile degil
        // keySet ile cikmaliyiz




//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim

        for (Integer eachKey : ogrenciKeySeti){ // 101


 //            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
               String eachValue =  ogrenciMap.get(eachKey);

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
               String[] eachValueArr = eachValue.split("-");

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini update edin
            // [Kemal, Cem, 10, K, TM]
            // 10/K sinifindaki ogrencilerin subelerini Z yapin
            if (eachValueArr[2].equalsIgnoreCase(sinif+"") && eachValueArr[3].equalsIgnoreCase(eskiSube)){

                eachValueArr[3] = yeniSube;

//            6- array'de yapilan degisikligi map'e tasimak icin
//               array'i - ile birlestirip yeniValue olusturalim

                String yeniValue = String.join("-",eachValueArr);

//            7- eachKey ve yeni value ile map'i update edelim

                ogrenciMap.put(eachKey,yeniValue);

            }



        }

        // 6.ve 7.adimlari if icinde yazdik ki
        // tum ogrencileri yeniden map'e eklemeye calismasin
        // sadece sinif ve subesi istenen degere esit olan ogrencileri guncellesin ve map'e ekleyip update etsin



        System.out.println(ogrenciMap);



    }
}
