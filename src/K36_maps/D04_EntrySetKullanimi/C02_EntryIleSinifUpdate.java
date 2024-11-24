package K36_maps.D04_EntrySetKullanimi;


import K36_maps.D02_BilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C02_EntryIleSinifUpdate extends OgrenciMap {

    public static void main(String[] args) {

        // 11.siniftaki ogrencileri 12.sinif yapin

        System.out.println(ogrenciMap);


        // 1.adim EntrySet olustur
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2.adim bir for-each loop ile tum Entry'leri gozden gecirelim

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {

            //3.adim  ogrenci value'sunu kaydedelim
            String eachvalue = eachEntry.getValue();

            //4.adim value'deki bilgilere erisebilmek icin split edelim
            String[] eachValueArr = eachvalue.split("-");

            //5.adim istenen kontrolleri yapip, istenen bilgileri update edin
            if (eachValueArr[2].equalsIgnoreCase("11")) {
                eachValueArr[2] = "12";
            }

            //6.adim array'de yaptigimiz degisikligi map'de update yapabilmek icin
            //       array'i yeniValue olarak birlestirelim

            eachEntry.setValue(String.join("-",eachValueArr)) ;
        }

        System.out.println(ogrenciMap);
    }
}
