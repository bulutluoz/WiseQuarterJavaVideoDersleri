package K36_maps.D04_entrySetKullanimi;


import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C03_EntryIleSubeUpdate extends OgrenciMap {

    public static void main(String[] args) {

        // Entry kullanarak, 11/M sinifindaki ogrencileri
        // 11/T olarak guncelleyin
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
            // 11/M sinifindaki ogrencileri
            // 11/T olarak guncelleyin

            if (eachValueArr[2].equalsIgnoreCase("11") && eachValueArr[3].equalsIgnoreCase("M")){
                eachValueArr[3] = "T";
            }

            //6.adim array'de yaptigimiz degisikligi map'de update yapabilmek icin
            //       array'i yeniValue olarak birlestirelim

            eachEntry.setValue(String.join("-",eachValueArr)) ;
        }

        System.out.println(ogrenciMap);
    }
}
