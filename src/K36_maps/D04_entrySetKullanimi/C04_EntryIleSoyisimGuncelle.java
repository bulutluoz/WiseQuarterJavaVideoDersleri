package K36_maps.D04_entrySetKullanimi;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C04_EntryIleSoyisimGuncelle extends OgrenciMap {

    public static void main(String[] args) {

        // Tum ogrencilerin soyisimlerini buyuk harf yapin

        // 1.adim EntrySet olustur
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2.adim bir for-each loop ile tum Entry'leri gozden gecirelim

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {

            //3.adim  ogrenci value'sunu kaydedelim
            String eachvalue = eachEntry.getValue();

            //4.adim value'deki bilgilere erisebilmek icin split edelim
            String[] eachValueArr = eachvalue.split("-");

            //5.adim istenen kontrolleri yapip, istenen bilgileri update edin
            //       Tum ogrencilerin soyisimlerini buyuk harf yapin

            eachValueArr[1] = eachValueArr[1].toUpperCase();

            //6.adim array'de yaptigimiz degisikligi map'de update yapabilmek icin
            //       array'i yeniValue olarak birlestirelim

            eachEntry.setValue(String.join("-",eachValueArr)) ;
        }

        System.out.println(ogrenciMap);

    }
}
